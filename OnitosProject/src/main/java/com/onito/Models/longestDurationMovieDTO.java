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
public class longestDurationMovieDTO {
	
	
    private String tconst;
	
	private String primaryTitle;
	
	private Integer runtimeMinutes;
	
	private String genres;

}
