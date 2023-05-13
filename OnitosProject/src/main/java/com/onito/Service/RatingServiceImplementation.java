package com.onito.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onito.Exceptions.MovieExceptions;
import com.onito.Exceptions.RatingExceptions;
import com.onito.Models.TopRatedMovieDTO;
import com.onito.Repository.RatingRepository;

@Service
public class RatingServiceImplementation implements RatingServices{

	@Autowired
	private RatingRepository rRepo;	
	
	@Override
	public List<TopRatedMovieDTO> findTopRatedMovies() throws MovieExceptions, RatingExceptions {
		// TODO Auto-generated method stub
		List<TopRatedMovieDTO>topRatedMoviesList = rRepo.getTopRatedMovies();
		return topRatedMoviesList;
	}

	
	
}
