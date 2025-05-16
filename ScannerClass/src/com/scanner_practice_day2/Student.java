package com.scanner_practice_day2;

public class Student {
	String name;
	int rollNo;
	int maths;
	int physics;
	int chemistry;
	
	float average;
	char grade;

	public Student(String name, int rollNo, int maths, int physics, int chemistry) {
		this.name = name;
		this.rollNo = rollNo;
		this.maths = maths;
		this.physics = physics;
		this.chemistry = chemistry;
		
		calculateResult();
	}
	
	public void calculateResult() {
		
		int total = maths + physics + chemistry;
		average = total / 3;
		
		if(average > 101) {
			System.out.println("Invalid marks");
		}else if(average >= 90 && average <= 100) {
			grade = 'A';
		}else if( average >= 80 && average <= 89) {
			grade = 'B';
		}else if( average >= 70 && average <= 79) {
			grade = 'C';
		}else if(average >= 60 && average <= 69) {
			grade = 'D';
		}else {
			grade = 'F';
		}
	}
	
	public void printDetails() {
		 System.out.println("\n<<<< STUDENT REPORT >>>>");
	        System.out.println("Name              : " + name);
	        System.out.println("Roll Number       : " + rollNo);
	        System.out.println("Maths Marks       : " + maths);
	        System.out.println("Physics Marks     : " + physics);
	        System.out.println("Chemistry Marks   : " + chemistry);
	 
	        System.out.println("Average           : " + average);
	        System.out.println("Grade             : " + grade);
	        System.out.println("==========================");
	}
	


}
