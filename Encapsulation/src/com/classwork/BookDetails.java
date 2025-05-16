package com.classwork;

public class BookDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book();
		book.setBookId(105);
		book.setTitle("Game of thrones");
		book.setAuthor("Geroge R.R. Martin");
		book.setPrice(500);
		
		System.out.println("Book title : " + book.getTitle());
		System.out.println("Book Id : " + book.getBookId());
		System.out.println("Book Author : " + book.getAuthor());
		System.out.println("Book Price : " + book.getPrice());

	}

}
