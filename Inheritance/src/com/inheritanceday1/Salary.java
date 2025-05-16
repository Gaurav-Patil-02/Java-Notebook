package com.inheritanceday1;

public class Salary extends Employee {
	
	int  basicPay;
	private double hra;
	private double da;
	private double netSalary;
	
	
	public Salary(int basicPay, int empId, String empName) {
		super(empId, empName);
		this.basicPay = basicPay;
	}
	
	
	public void getTotalSalary() {
		 hra = 0.20f * basicPay;
		 da = 0.10f * basicPay;
		 netSalary = basicPay + hra + da;
		 
		 salarySlip();
		 
	}
	
	public void salarySlip() {
		System.out.println("<<<< Salary Slip >>>>");
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee Id   : " + empId);
		System.out.println("Basic Salary  : " + basicPay);
		System.out.println("HRA (20%)     : " + hra);
		System.out.println("DA  (10%)     : " + da);
		System.out.println("Net Salary    : " + netSalary);
	}

	
	
}
