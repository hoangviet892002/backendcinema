package com.example.firstprojectspring.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bookingDetails")
public class BookingDetail {

    @Id
    private String id;
    private String bookingId;
    private String seatId;
    private double price;

    // Getters and setters
}

