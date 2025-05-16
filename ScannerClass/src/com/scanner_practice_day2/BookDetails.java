package com.scanner_practice_day2;

import java.util.Scanner;

public class BookDetails {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Title of the Book");
		String title = scan.nextLine();
		
		System.out.println("Enter Author Name");
		String author = scan.nextLine();
		
		System.out.println("Enter Price of the Book");
		int price = scan.nextInt();
		
		Book book = new Book(title, author, price);
		book.bookDetails();
	}
}
