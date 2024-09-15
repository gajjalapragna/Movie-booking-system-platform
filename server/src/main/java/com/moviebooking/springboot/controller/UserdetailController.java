package com.moviebooking.springboot.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moviebooking.springboot.exception.ResourceNotFoundException;
import com.moviebooking.springboot.model.Userdetail;
import com.moviebooking.springboot.repository.UserdetailRepository;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class UserdetailController {

    @Autowired
    private UserdetailRepository userdetailRepository;


    @GetMapping("/userdetail/{password}")
    public ResponseEntity<Userdetail> checkUser(@PathVariable String password) {
        System.out.println(password);
        Userdetail userdetail = userdetailRepository.findById(password)
                .orElseThrow(() -> new ResourceNotFoundException("user not exist with password :" + password));
        return ResponseEntity.ok(userdetail);
    }


}
