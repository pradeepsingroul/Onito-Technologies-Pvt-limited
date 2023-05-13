package com.onito.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onito.Exceptions.MovieExceptions;
import com.onito.Exceptions.RatingExceptions;
import com.onito.Models.Movies;
import com.onito.Models.longestDurationMovieDTO;
import com.onito.Models.sumVotesDTO;
import com.onito.Repository.MoviesRepository;

@Service
public class MoviesServiceImplementation implements MoviesSerrvice{
	
	@Autowired
	private MoviesRepository mRepo;
	


}
