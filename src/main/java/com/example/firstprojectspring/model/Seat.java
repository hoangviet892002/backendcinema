package com.example.firstprojectspring.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "seats")
public class Seat {

    @Id
    private String id;
    private String showtimeId;
    private int rowNumber;
    private String seatNumber;
    private String status;

    // Getters and setters
}
