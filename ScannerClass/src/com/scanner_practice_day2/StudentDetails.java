package com.scanner_practice_day2;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Student's Name ");
		String name =  scan.nextLine();
		
		System.out.println("Enter Student's Roll Number ");
		int rollNo =  scan.nextInt();
		
		System.out.println("Enter Marks in Mathmatics ");
		int  maths =  scan.nextInt();
		
		System.out.println("Enter Marks in Physics ");
		int physics =  scan.nextInt();
		
		System.out.println("Enter Marks in Chemistry ");
		int chemistry =  scan.nextInt();
		
		Student student = new Student(name, rollNo, maths, physics, chemistry);
		student.printDetails();

	}

}
