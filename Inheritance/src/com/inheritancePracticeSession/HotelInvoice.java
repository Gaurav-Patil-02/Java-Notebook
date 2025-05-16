package com.inheritancePracticeSession;

public class HotelInvoice {
	public static void main(String args[]) {
		HotelRoom hr = new HotelRoom(105, "2BHK", 300, true, 'B', 10);
		hr.bill();
		HotelRoom hr1 = new HotelRoom(106, "1BHK", 200, false, 'C', 50);
		hr1.bill();
		
	}
}
