package com.moviebooking.springboot.repository;
import com.moviebooking.springboot.model.Getbookingsbyemail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GetbookingsbyemailRepository extends JpaRepository<Getbookingsbyemail, String>{
}


