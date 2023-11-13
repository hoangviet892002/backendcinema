package com.example.firstprojectspring.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "auditoriums")
public class Auditorium {

    @Id
    private String id;
    private String theaterId;
    private String name;
    private int seatsCount;
    private double baseTicketPrice;

    // Getters and setters
}
