package com.moviebooking.springboot.repository;
import com.moviebooking.springboot.model.Getshowbytheateridandmovieid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GetshowbytheateridandmovieidRepository extends JpaRepository<Getshowbytheateridandmovieid, String>{
}


