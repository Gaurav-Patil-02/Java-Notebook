package com.constructorPracticeDay3;

class Book {
    private int bookId;
    private String title;
    private String author;
    private double price;
    private int availableCopies;

    public Book(int bookId, String title, String author, double price, int availableCopies) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.availableCopies = availableCopies;
    }

    public void issueBook() {
        if (availableCopies > 0) {
            availableCopies--;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("No available copies to issue.");
        }
    }

    public void returnBook() {
        availableCopies++;
        System.out.println("Book returned successfully.");
    }

   public void displayBookDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : " + price);
        System.out.println("Available Copies: " + availableCopies);
    }
}




