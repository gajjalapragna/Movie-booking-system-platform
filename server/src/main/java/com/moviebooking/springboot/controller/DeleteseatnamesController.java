package com.moviebooking.springboot.controller;
import com.moviebooking.springboot.exception.ResourceNotFoundException;
import com.moviebooking.springboot.model.Deletebookingbyusername;
import com.moviebooking.springboot.model.Deleteseatnames;
import com.moviebooking.springboot.repository.DeletebookingbyusernameRepository;
import com.moviebooking.springboot.repository.DeleteseatnamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class DeleteseatnamesController {

    @Autowired
    private DeleteseatnamesRepository deleteseatnamesRepository;


    // delete show rest api
    @DeleteMapping("/deleteseatnames/{seatnames}")
    public ResponseEntity<Map<String, Boolean>> deleteBookedseats(@PathVariable String seatnames){
        Deleteseatnames deleteseatnames = deleteseatnamesRepository.findById(seatnames)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + seatnames));

        deleteseatnamesRepository.delete(deleteseatnames);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }




}
