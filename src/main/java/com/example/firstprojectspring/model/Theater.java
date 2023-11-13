package com.example.firstprojectspring.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "theaters")
public class Theater {

    @Id
    private String id;
    private String name;
    private String address;
    private String city;
    private String country;

    // Getters and setters
}
