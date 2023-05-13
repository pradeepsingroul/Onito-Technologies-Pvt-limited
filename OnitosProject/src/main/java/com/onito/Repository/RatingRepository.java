package com.onito.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.onito.Exceptions.MovieExceptions;
import com.onito.Exceptions.RatingExceptions;
import com.onito.Models.Ratings;
import com.onito.Models.TopRatedMovieDTO;

@Repository
public interface RatingRepository extends JpaRepository<Ratings, String>{
	
	//	jpql
		//top rated movies
		@Query("select new com.onito.Models.TopRatedMovieDTO(m.tconst,m.primaryTitle,m.genres,r.averageRating) from Movies m INNER JOIN Ratings r ON m.tconst = r.tconst where r.averageRating >= 6")
		List<TopRatedMovieDTO> getTopRatedMovies();
	

}
