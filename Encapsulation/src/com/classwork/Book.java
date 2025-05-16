package com.classwork;

public class Book {
	private int bookId;
	private String title;
	private String author;
	private int price;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price <= 100) {
			System.out.println("Price should be greater than 100");
		}else {
			this.price = price;
		}
	}

}
