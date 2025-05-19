package com.throwskeyword;

public class CalculateMarks {
	public void marks(int num) {
		if (num > 100 || num < 0) {
			throw new IllegalArgumentException("marks should be less than 100 and greater than 0");
		} else
			System.out.println("Process to calculate marks");
	}

	public static void main(String[] args) {
		CalculateMarks cm = new CalculateMarks();
		cm.marks(101);
	}

}
