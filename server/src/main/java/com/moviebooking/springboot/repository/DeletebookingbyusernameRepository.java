package com.moviebooking.springboot.repository;
import com.moviebooking.springboot.model.Deletebookingbyusername;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DeletebookingbyusernameRepository extends JpaRepository<Deletebookingbyusername, String>{
}


