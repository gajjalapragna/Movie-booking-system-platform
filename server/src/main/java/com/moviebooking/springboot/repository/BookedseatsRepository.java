package com.moviebooking.springboot.repository;
import com.moviebooking.springboot.model.Bookedseats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookedseatsRepository extends JpaRepository<Bookedseats, Long>{
}


