package com.onito.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.onito.Exceptions.MovieExceptions;
import com.onito.Exceptions.RatingExceptions;
import com.onito.Models.longestDurationMovieDTO;
import com.onito.Models.TopRatedMovieDTO;


public interface RatingServices {
	
	public List<TopRatedMovieDTO> findTopRatedMovies() throws MovieExceptions,RatingExceptions;
	

}
