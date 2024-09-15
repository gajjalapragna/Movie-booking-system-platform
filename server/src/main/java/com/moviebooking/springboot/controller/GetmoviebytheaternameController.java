package com.moviebooking.springboot.controller;
import com.moviebooking.springboot.exception.ResourceNotFoundException;
import com.moviebooking.springboot.model.Getmoviebytheatername;
import com.moviebooking.springboot.repository.GetmoviebytheaternameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class GetmoviebytheaternameController {

    @Autowired
    private GetmoviebytheaternameRepository getmoviebytheaternameRepository;


    @GetMapping("/getmoviebytheatername/{theatername}")
    public ResponseEntity<Getmoviebytheatername> getMovieByTheaterName(@PathVariable String theatername) {
        System.out.println(theatername);
        Getmoviebytheatername getmoviebytheatername = getmoviebytheaternameRepository.findById(theatername)
                .orElseThrow(() -> new ResourceNotFoundException("user not exist with password :" + theatername));
        return ResponseEntity.ok(getmoviebytheatername);
    }


}
