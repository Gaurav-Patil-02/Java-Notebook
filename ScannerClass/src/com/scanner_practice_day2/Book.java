package com.scanner_practice_day2;

public class Book {
	String title;
	String author;
	int price;
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void bookDetails() {
		System.out.println("Book Title : " + title);
		System.out.println("Book Author : " + author);
		System.out.println("Book Price : " + price);
	}
	
	
}
