package com.example.servermanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/servers")
public class ServerController {

    @Autowired
    private ServerRepository serverRepository;

    @GetMapping("")
    public ResponseEntity<List<Server>> getServers(@RequestParam(required = false) String id) {
        if (id == null) {
            return ResponseEntity.ok(serverRepository.findAll());
        } else {
            Optional<Server> server = serverRepository.findById(id);
            if (server.isPresent()) {
                return ResponseEntity.ok(List.of(server.get()));
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
        }
    }

    @PutMapping("")
    public ResponseEntity<Void> createServer(@RequestBody Server server) {
        serverRepository.save(server);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteServer(@PathVariable String id) {
        serverRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/search")
    public ResponseEntity<List<Server>> searchServers(@RequestParam String name) {
        List<Server> servers = serverRepository.findByNameContainingIgnoreCase(name);
        if (servers.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        } else {
            return ResponseEntity.ok(servers);
        }
    }
}
