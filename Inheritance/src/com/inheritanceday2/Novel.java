package com.inheritanceday2;

public class Novel extends Book{
	String genre;

	public Novel(String title, String genre ) {
		super(title);
		this.genre = genre;
	}
	
	public String getGenre() {
		return this.genre;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Novel n = new Novel("Game Of Thrones", "Fantasy, Drama");
		System.out.println(n.getTitle());
		System.out.println(n.getGenre());
		

	}

}
