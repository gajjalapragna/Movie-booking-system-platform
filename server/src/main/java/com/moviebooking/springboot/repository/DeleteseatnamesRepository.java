package com.moviebooking.springboot.repository;
import com.moviebooking.springboot.model.Deleteseatnames;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DeleteseatnamesRepository extends JpaRepository<Deleteseatnames, String>{
}


