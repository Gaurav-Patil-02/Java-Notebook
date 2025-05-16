package com.inheritanceday1;

public class StudentDetails {
	public static void main(String[] args) {
		Marks marks = new Marks(89, 86, "Gaurav", 105);
		System.out.println("Student Name : "+marks.name);
		System.out.println("Student Roll NO : "+marks.rollNo);
		System.out.println("Student Marks in Subject 1 : "+marks.sub1);
		System.out.println("Student Marks in Subject 2 : "+marks.sub2);
		marks.getTotal();
	}
	
}
