package com.classwork;

public class StudentDetails {
	public static void main(String[] args) {
		Student stud = new Student(104, "Gaurav" , 78);
		stud.setId(105);
		stud.setName("Somnath");
		stud.setMarks(89);
		
		System.out.println("Student Id : " + stud.getId());
		System.out.println("Student Name : " + stud.getName());
		System.out.println("Student Marks : " + stud.getMarks());
	}
	
	
}
