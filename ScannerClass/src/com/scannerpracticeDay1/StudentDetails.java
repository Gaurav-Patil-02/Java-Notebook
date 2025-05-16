package com.scannerpracticeDay1;

import java.util.Scanner;

public class StudentDetails {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Roll No");
		int rollNo = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Enter Student's Name");
		String name = scan.nextLine();
		
		System.out.println("Enter Student's Courses");
		String course = scan.nextLine();
		
		System.out.println("Enter Marks");
		int marks = scan.nextInt();
		
		Student student = new Student(rollNo, name, course, marks);
		student.studentDetails();
		
		
	}
}
