package com.onito.Models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Ratings {
	
	@Id
	private Integer id;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Movies tconst;
	
	private Double averageRating;
	
	private Integer numVotes;

}
