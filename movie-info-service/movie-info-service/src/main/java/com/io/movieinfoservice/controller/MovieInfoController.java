package com.io.movieinfoservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.io.movieinfoservice.service.Movie;

@RestController
@RequestMapping("/movies")
public class MovieInfoController {

	@RequestMapping("/movieData")
	public List<Movie> getMovieData() {

		List<Movie> list = new ArrayList<>();

		Movie m1 = new Movie("1", "WAR", "2019", "0", "Hindi");
		Movie m2 = new Movie("2", "Force", "2019", "0", "Hindi");
		Movie m3 = new Movie("3", "Gully Boy", "2019", "0", "Hindi");
		Movie m4 = new Movie("4", "Ford v/s Ferrarei", "2019", "0", "English");
		Movie m5 = new Movie("5", "Once Upon A Time In HolyWood", "2019", "0", "English");
		Movie m6 = new Movie("6", "TopGun-Maveric", "2020", "0", "English");

		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		list.add(m6);

		
		return list;

	}

	@RequestMapping("/{movieId}")
	public String getMovieInfo(@PathVariable String movieId) {

		Movie movie = new Movie();
		movie.setMovieId(movieId);
		movie.setMovieName("DDLJ");

		return "Kapil";

	}

}
