package com.moviebooking.springboot.controller;
import com.moviebooking.springboot.exception.ResourceNotFoundException;
import com.moviebooking.springboot.model.Booking;
import com.moviebooking.springboot.model.Deletebookingbyusername;
import com.moviebooking.springboot.model.Movie;
import com.moviebooking.springboot.model.Show;
import com.moviebooking.springboot.repository.BookingRepository;
import com.moviebooking.springboot.repository.DeletebookingbyusernameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class DeletebookingbyusernameController {

    @Autowired
    private DeletebookingbyusernameRepository deletebookingbyusernameRepository;


    // delete show rest api
    @DeleteMapping("/deletebookingbyusername/{username}")
    public ResponseEntity<Map<String, Boolean>> deleteBooking(@PathVariable String username){
        Deletebookingbyusername deletebookingbyusername = deletebookingbyusernameRepository.findById(username)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + username));

        deletebookingbyusernameRepository.delete(deletebookingbyusername);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }




}
