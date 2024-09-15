package com.moviebooking.springboot.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moviebooking.springboot.model.Booking;
import com.moviebooking.springboot.repository.BookingRepository;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class BookingController {

    @Autowired
    private BookingRepository bookingRepository;


    // create employee rest api
    @PostMapping("/data")
    public Booking addBooking(@RequestBody Booking booking) {
        return bookingRepository.save(booking);
    }




}
