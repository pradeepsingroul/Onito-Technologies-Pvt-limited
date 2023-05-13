package com.onito.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.onito.Exceptions.MovieExceptions;
import com.onito.Exceptions.RatingExceptions;
import com.onito.Models.Ratings;
import com.onito.Models.TopRatedMovieDTO;

@Repository
public interface RatingRepository extends JpaRepository<Ratings, String>{
	
	
	

}
