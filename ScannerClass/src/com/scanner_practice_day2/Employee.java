package com.scanner_practice_day2;

public class Employee {	
	
	int empId;
	String empName;
	int basicSalary;
	
	double hra;
	double da;
	double netSalary;
	
	public Employee(int empId, String empName, int basicSalary) {
		this.empId = empId;
		this.empName = empName;
		this.basicSalary = basicSalary;
		
		calculateSalary();
	}
	
	public void calculateSalary() {
		 hra = 0.20f * basicSalary;
		 da = 0.10f * basicSalary;
		 netSalary = basicSalary + hra + da;	
	}
	
	public void salarySlip() {
		System.out.println("<<<< Salary Slip >>>>");
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee Id   : " + empId);
		System.out.println("Basic Salary  : " + basicSalary);
		System.out.println("HRA (20%)     : " + hra);
		System.out.println("DA  (10%)     : " + da);
		System.out.println("Net Salary    : " + netSalary);
	}
	
	
}
