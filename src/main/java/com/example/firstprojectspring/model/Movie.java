package com.example.firstprojectspring.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "movies")
public class Movie {

    @Id
    private String id;
    private String title;
    private String genre;
    private String director;
    private String cast;
    private int releaseYear;
    private int duration;
    private String description;

    // Getters and setters
}
