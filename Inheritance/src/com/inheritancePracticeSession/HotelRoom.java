package com.inheritancePracticeSession;

public class HotelRoom {
	private int roomNumber;
	private String roomType;
	private float rentParNight;
	private boolean isACAvailable;
	private char roomGrade;
	private double discount;
	


	public HotelRoom(int roomNumber, String roomType, float rentParNight, boolean isACAvailable, char roomGrade,
			double discount) {
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.rentParNight = rentParNight;
		this.isACAvailable = isACAvailable;
		this.roomGrade = roomGrade;
		this.discount = discount;
	}

	
	public int getRoomNumber() {
		return roomNumber;
	}
	
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}



	public String getRoomType() {
		return roomType;
	}



	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}



	public float getRentParNight() {
		return rentParNight;
	}



	public void setRentParNight(float rentParNight) {
		this.rentParNight = rentParNight;
	}



	public boolean isACAvailable() {
		return isACAvailable;
	}



	public void setACAvailable(boolean isACAvailable) {
		this.isACAvailable = isACAvailable;
	}



	public char getRoomGrade() {
		return roomGrade;
	}



	public void setRoomGrade(char roomGrade) {
		this.roomGrade = roomGrade;
	}



	public double getDiscount() {
		return discount;
	}



	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public double finalRent() {
		return rentParNight - (rentParNight * (discount / 100));
	}
	
	public void bill() {
	System.out.println("<<<<< TAX Inovoice >>>>>");
	System.out.println("Room Number          : " + getRoomNumber());
	System.out.println("Room Type            : " + getRoomType());
	System.out.println("Rent Per Night       : " + getRentParNight());
	System.out.println("AC Availabel or not  : " + isACAvailable());
	System.out.println("Room Grade           : " + getRoomGrade());
	System.out.println("Discount on Rent     : " + getDiscount());
	System.out.println("Net Amount to Pay    : " + finalRent());
	System.out.println();
	}
}
