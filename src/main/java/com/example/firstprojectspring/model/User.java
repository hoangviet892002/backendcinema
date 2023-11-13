package com.example.firstprojectspring.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {

    @Id
    private String id;
    private String username;
    private String password;
    private String fullName;
    private String email;
    private String phoneNumber;

    // Getters and setters
}
