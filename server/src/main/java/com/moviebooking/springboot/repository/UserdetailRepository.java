package com.moviebooking.springboot.repository;

import com.moviebooking.springboot.model.Userdetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moviebooking.springboot.model.User;

@Repository
public interface UserdetailRepository extends JpaRepository<Userdetail, String>{
}


