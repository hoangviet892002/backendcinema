package com.example.firstprojectspring.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "showtimes")
public class Showtime {

    @Id
    private String id;
    private String movieId;
    private String auditoriumId;
    private Date showDate;
    private String showTimeFrame;
    private double baseTicketPrice;

    // Getters and setters
}
