package com.onito.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.onito.Exceptions.MovieExceptions;
import com.onito.Exceptions.RatingExceptions;
import com.onito.Models.Movies;
import com.onito.Models.longestDurationMovieDTO;
import com.onito.Models.sumVotesDTO;


public interface MoviesService {
	
	public List<longestDurationMovieDTO> maxDurationMovies() throws MovieExceptions;
	
	public Movies createMovies(Movies movie) throws MovieExceptions;
	
	public void getUpdatedRuntimeMovies() throws MovieExceptions,RatingExceptions;
	
	public List<sumVotesDTO> calculateVotes() throws MovieExceptions,RatingExceptions;
	

}
