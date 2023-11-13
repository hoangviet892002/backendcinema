package com.example.firstprojectspring.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "bookings")
public class Booking {

    @Id
    private String id;
    private String userId;
    private String showtimeId;
    private double totalPrice;
    private Date bookingDate;

    // Getters and setters
}

