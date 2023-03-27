package com.example.servermanager;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "servers")
public class Server {

    @Id
    private String id;
    private String name;
    private String language;
    private String framework;

    public Server() {
    }

    public Server(String id, String name, String language, String framework) {
        this.id = id;
        this.name = name;
        this.language = language;
        this.framework = framework;
    }

    // getters and setters omitted for brevity
}
