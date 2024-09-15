package com.moviebooking.springboot.controller;
import com.moviebooking.springboot.exception.ResourceNotFoundException;
import com.moviebooking.springboot.model.Getbookingsbyemail;
import com.moviebooking.springboot.model.Getearnings;
import com.moviebooking.springboot.model.Movie;
import com.moviebooking.springboot.repository.GetbookingsbyemailRepository;
import com.moviebooking.springboot.repository.GetearningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class GetearningsController {

    @Autowired
    private GetearningRepository getearningRepository;


    @GetMapping("/getearnings")
    public List<Getearnings> getAllShow(){
        return getearningRepository.findAll();
    }


}
