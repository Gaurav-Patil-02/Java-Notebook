package com.scannerpracticeDay1;

import java.util.Scanner;

public class Ticket {
	static int totalSeats = 50;

	String name;
	int age;
	int numOfTickets;

	public void getTicket() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Your name");
		name = scan.nextLine();

		System.out.println("Enter Your Age");
		age = scan.nextInt();

		System.out.println("Number of Tickets you want");
		numOfTickets = scan.nextInt();
		
		if(numOfTickets >= totalSeats) {
			System.out.println("Seats Not Available");
			totalSeats = totalSeats - numOfTickets;
		}else {
			System.out.println("Your seats are confirmed");
		}
	}

}
