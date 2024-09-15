package com.moviebooking.springboot.repository;
import com.moviebooking.springboot.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookingRepository extends JpaRepository<Booking, Long>{
}


