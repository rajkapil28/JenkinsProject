package com.io.movieinfoservice.service;

public class Movie {

	private String movieId;
	private String movieName;
	private String releaseYear;
	private String rating;
	private String language;
	
	
	public Movie() {
		super();
		}

	

	public Movie(String movieId, String movieName, String releaseYear, String rating, String language) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.releaseYear = releaseYear;
		this.rating = rating;
		this.language = language;
	}



	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	
	
	
	
}
