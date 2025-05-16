package com.scanner_practice_day2;

import java.util.Scanner;

public class EmployeeDetails {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Employee Id");
		int id =  scan.nextInt();
		scan.nextLine();
		
		System.out.println("Enter Employee Name");
		String name = scan.nextLine();
		
		System.out.println("Enter Basic Salary of Employee");
		int basicSalary = scan.nextInt();
		
		Employee emp = new Employee(id, name, basicSalary);
		emp.salarySlip();
	}
}
