package com.onito.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.onito.Models.TopRatedMovieDTO;
import com.onito.Service.RatingServices;

@RestController
@RequestMapping("api/v1")
public class RatingController {
	
	@Autowired
	private RatingServices rService;
	
	
	//getting top ratted movies
	@GetMapping("/top-rated")
	public ResponseEntity<List<TopRatedMovieDTO>> getTop10MoviesHandler(){
		List<TopRatedMovieDTO> top10MoviesList = rService.findTopRatedMovies(); //getting movies list
//		System.out.println(top10MoviesList);
		return new ResponseEntity<List<TopRatedMovieDTO>>(top10MoviesList,HttpStatus.OK); // returning
	}
	

}
