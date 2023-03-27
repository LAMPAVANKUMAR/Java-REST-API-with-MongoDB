package com.example.servermanager;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ServerRepository extends MongoRepository<Server, String> {

    List<Server> findByNameContainingIgnoreCase(String name);
}
