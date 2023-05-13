package com.onito.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.onito.Exceptions.MovieExceptions;
import com.onito.Models.Movies;
import com.onito.Models.longestDurationMovieDTO;
import com.onito.Models.sumVotesDTO;

import jakarta.transaction.Transactional;

@Repository
public interface MoviesRepository extends JpaRepository<Movies, String>{
	
	 //jpql
	 //top 10 movie with logest runtime duration
	 @Query("select new com.onito.Models.longestDurationMovieDTO(m.tconst,m.primaryTitle,m.runtimeMinutes,m.genres) from Movies m order by runtimeMinutes DESC LIMIT 10")
	 List<longestDurationMovieDTO> getLongestRuntimeMovies();
	 
	 
	//sql
	//updating the runtime minutes based on the genres
	@Modifying
	@Transactional
	@Query(value="Update Movies set runtime_Minutes = CASE WHEN genres = 'Documentary' THEN runtime_minutes+15 WHEN genres = 'Animation' THEN runtime_minutes+30 ELSE runtime_Minutes+45 END",nativeQuery = true)
	void updateRuntimeMinutes(); 
	 
	
}
