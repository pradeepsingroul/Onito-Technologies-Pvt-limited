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
	

	@Override
	public List<longestDurationMovieDTO> maxDurationMovies() throws MovieExceptions {
		// TODO Auto-generated method stub
		List<longestDurationMovieDTO> movieDTOList = mRepo.getLongestRuntimeMovies();
		return movieDTOList;
	}

	@Override
	public Movies createMovies(Movies movie) throws MovieExceptions {
		// TODO Auto-generated method stub
		Optional<Movies> opt = mRepo.findById(movie.getTconst());
		if(opt.isEmpty())return mRepo.save(movie);
		else throw new MovieExceptions("movie already exits with the name of : "+ movie.getTconst());
		
	}

	@Override
	public void getUpdatedRuntimeMovies() throws MovieExceptions, RatingExceptions {
		mRepo.updateRuntimeMinutes();

	}

	@Override
	public List<sumVotesDTO> calculateVotes() throws MovieExceptions, RatingExceptions {
		List<sumVotesDTO> votes = mRepo.findAllvotes();
		return votes;
	}
	


}
