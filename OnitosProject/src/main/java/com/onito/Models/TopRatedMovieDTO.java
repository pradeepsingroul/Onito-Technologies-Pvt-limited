package com.onito.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TopRatedMovieDTO {
	
	private String tconst;
	
	private String primaryTitle;
	
	private String genre;
	
	private Double averageRating;

}
