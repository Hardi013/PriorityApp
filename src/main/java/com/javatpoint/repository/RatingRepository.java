package com.javatpoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatpoint.model.Area;
import com.javatpoint.model.UserRating;

public interface RatingRepository extends JpaRepository<UserRating, Integer>{

}
