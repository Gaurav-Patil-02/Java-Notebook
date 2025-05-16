package com.constructorPracticeDay2;

public class Movie {
	String movieName;
	String genre;
	int rating;
	
	public Movie(String movieName, String genre, int rating) {
		this.movieName = movieName;
		this.genre = genre;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", genre=" + genre + ", rating=" + rating + "]";
	}
	
	
}
