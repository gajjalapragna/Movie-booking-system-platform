package com.moviebooking.springboot.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moviebooking.springboot.exception.ResourceNotFoundException;
import com.moviebooking.springboot.model.Getshowbytheateridandmovieid;
import com.moviebooking.springboot.repository.GetshowbytheateridandmovieidRepository;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class GetshowbytheateridandmovieidController {

    @Autowired
    private GetshowbytheateridandmovieidRepository getshowbytheateridandmovieidRepository;

    //get all shows rest api
    @GetMapping("/showbytheateridandmovieid/{theaterid}")
    public ResponseEntity<Getshowbytheateridandmovieid> getShowtimebytheaternameandmoviename(@PathVariable String theaterid ) {
        System.out.println(theaterid);
        Getshowbytheateridandmovieid getshowbytheateridandmovieid = getshowbytheateridandmovieidRepository.findById(theaterid)
                .orElseThrow(() -> new ResourceNotFoundException("user not exist with password :" + theaterid));
        return ResponseEntity.ok(getshowbytheateridandmovieid);
    }



}
