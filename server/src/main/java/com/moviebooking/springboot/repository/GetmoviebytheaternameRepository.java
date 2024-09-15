package com.moviebooking.springboot.repository;

import com.moviebooking.springboot.model.Getmoviebytheatername;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GetmoviebytheaternameRepository extends JpaRepository<Getmoviebytheatername, String>{
}


