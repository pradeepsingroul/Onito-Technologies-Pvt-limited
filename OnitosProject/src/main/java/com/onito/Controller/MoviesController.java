package com.onito.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onito.Models.Movies;
import com.onito.Models.longestDurationMovieDTO;
import com.onito.Models.sumVotesDTO;
import com.onito.Repository.MoviesRepository;
import com.onito.Service.MoviesSerrvice;





@RestController
@RequestMapping("api/v1")
public class MoviesController {
	
	@Autowired
	private MoviesSerrvice mServices;
	
	@Autowired
	private MoviesRepository mrepo;
	
	
	
	//create movies
	@PostMapping("/create-movie")
	public ResponseEntity<String> registerMovieHandler(@RequestBody Movies mv){
		Movies movie = mServices.createMovies(mv); // getting register movies data
		String str = movie+" : movie successfuly register "; //cancatination with succesfull message
		return new ResponseEntity<String>(str,HttpStatus.CREATED); //returning
	}
	
	//find top 10 longest duratin movies
	@GetMapping("/longest-duration-movies")
	public ResponseEntity<List<longestDurationMovieDTO>> getTop10MoviesHandler(){
		List<longestDurationMovieDTO> top10MoviesList = mServices.maxDurationMovies(); //getting movies
		return new ResponseEntity<List<longestDurationMovieDTO>>(top10MoviesList,HttpStatus.OK); //returning movies
	}
	
	
	//ipdating the runtime minutes
	@GetMapping("/update-runtimeMinutes")
	public ResponseEntity<List<Movies>> updateRuntimeHandler(){
		mServices.getUpdatedRuntimeMovies(); //updating
		List<Movies> mvList = mrepo.findAll(); //getting the updated data
		
		return new ResponseEntity<List<Movies>>(mvList,HttpStatus.OK); //returning
	}
	
	
	@GetMapping("/genre-movies-with-subtotals")
	public ResponseEntity<List<sumVotesDTO>> getVotesHandler(){
		List<sumVotesDTO> top10MoviesList = mServices.calculateVotes(); //getting movies
		return new ResponseEntity<List<sumVotesDTO>>(top10MoviesList,HttpStatus.OK); //returning movies
	}
	
}
