package com.moviebooking.springboot.controller;
import com.moviebooking.springboot.model.Bookedseats;
import com.moviebooking.springboot.repository.BookedseatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;




@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class BookedseatsController {

    @Autowired
    private BookedseatsRepository bookedseatsRepository;


    //create show rest api
    @PostMapping("/bookedseats")
    public Bookedseats addBookedseats(@RequestBody Bookedseats bookedseats) {
        return bookedseatsRepository.save(bookedseats);
    }

}
