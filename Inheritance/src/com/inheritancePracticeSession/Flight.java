package com.inheritancePracticeSession;

public class Flight {
	private String flightNumber;
	private String airLine;
	private int capacity;
	private float ticketPrice;
	private boolean isDemestic;
	private char flightClass;

	public Flight(String flightNumber, String airLine, int capacity, float ticketPrice, boolean isDemestic,
			char flightClass) {
		super();
		this.flightNumber = flightNumber;
		this.airLine = airLine;
		this.capacity = capacity;
		this.ticketPrice = ticketPrice;
		this.isDemestic = isDemestic;
		this.flightClass = flightClass;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAirLine() {
		return airLine;
	}

	public void setAirLine(String airLine) {
		this.airLine = airLine;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public float getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(float ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public boolean isDemestic() {
		return isDemestic;
	}

	public void setDemestic(boolean isDemestic) {
		this.isDemestic = isDemestic;
	}

	public char getFlightClass() {
		return flightClass;
	}

	public void setFlightClass(char flightClass) {
		this.flightClass = flightClass;
	}
	
	public String flightType() {
		if(isDemestic) {
			return "Domestic";
		}
		else {
			return "International";
		}
	}
	
	public void ticketDetails() {
		System.out.println("Flight Number : " + getFlightNumber());
		System.out.println("Air Line : " + getAirLine());
		System.out.println("Flight Capacity : " + getCapacity());
		System.out.println("Ticket Rates : " + getTicketPrice());
		System.out.println("is domestic or not : " + isDemestic());
		System.out.println("Flight Class : " + getFlightClass());
	}
}
