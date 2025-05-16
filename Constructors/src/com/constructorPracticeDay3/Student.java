package com.constructorPracticeDay3;

public class Student {
	int studentId;
	String studentName;
	String course;
	int year;
	float percentage;
	
	public Student(int studentId, String studentName, String course, int year, float percentage) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.course = course;
		this.year = year;
		this.percentage = percentage;
	}
	
	public void studentDetails() {
		System.out.println("Student Id : "+this.studentId);
		System.out.println("Student Name : "+this.studentName);
		System.out.println("Student Course : "+this.course);
		System.out.println("Student Year : "+this.year);
		System.out.println("Student Percentage : "+this.percentage);
	}
	
	public void getGrade() {
		float marks = this.percentage;
		if(marks > 101) {
			System.out.println("Invalid marks");
		}else if(marks >= 90 && marks <= 100) {
			System.out.println("Grade : A");
		}else if( marks >= 80 && marks <= 89) {
			System.out.println("Grade : B");
		}else if( marks >= 70 && marks <= 79) {
			System.out.println("Grade : C");
		}else if(marks >= 60 && marks <= 69) {
			System.out.println("Grade : D");
		}else {
			System.out.println("Fail");
		}
	}
}
