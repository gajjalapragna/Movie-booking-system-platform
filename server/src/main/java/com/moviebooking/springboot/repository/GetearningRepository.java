package com.moviebooking.springboot.repository;
import com.moviebooking.springboot.model.Getearnings;
import com.moviebooking.springboot.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GetearningRepository extends JpaRepository<Getearnings, Long>{
}


