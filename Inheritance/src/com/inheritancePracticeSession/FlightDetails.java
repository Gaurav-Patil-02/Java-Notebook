package com.inheritancePracticeSession;

public class FlightDetails {
	public static void main(String[] args) {
	
		Flight f = new Flight("ABC555", "Indigo", 100, 500, true, 'A');
		f.ticketDetails();
		System.out.println("Flight type : "+ f.flightType());
	}
}
