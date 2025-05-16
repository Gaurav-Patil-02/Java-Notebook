package com.scannerpracticeDay1;

public class Student {
	int rollNo;
	String name;
	String course;
	int marks;
	
	public Student(int rollNo, String name, String course, int marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}
	
	public String getGrade() {
		if(marks > 101) {
			System.out.println("Invalid marks");
		}else if(marks >= 90 && marks <= 100) {
			return "A";
		}else if( marks >= 80 && marks <= 89) {
			return "B";
		}else if( marks >= 70 && marks <= 79) {
			return "C";
		}else if(marks >= 60 && marks <= 69) {
			return "D";
		}   
		return "F";
	}
		
	public void studentDetails() {
		System.out.println("Student Roll No : " + rollNo);
		System.out.println("Student Name : " + name);
		System.out.println("Student Course : " + course);
		System.out.println("Student Marks : " + marks);
		System.out.println("Student Grade : " + getGrade());
		
	}
	
	
	
}
