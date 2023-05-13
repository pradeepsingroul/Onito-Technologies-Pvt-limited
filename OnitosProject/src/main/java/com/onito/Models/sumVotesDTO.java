package com.onito.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Setter
@Getter

@NoArgsConstructor
public class sumVotesDTO {
	
	private String Genre;
	
	private String primaryTitle;

	private Integer numVotes;

	public sumVotesDTO(String genre, String primaryTitle, Integer numVotes) {
		super();
		Genre = genre;
		this.primaryTitle = primaryTitle;
		this.numVotes = numVotes;
	}

	
	
	
	
}
