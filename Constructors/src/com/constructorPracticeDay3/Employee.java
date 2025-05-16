package com.constructorPracticeDay3;

public class Employee {
	int empId;
	String empName;
	String designation;
	int salary;
	
	
	public Employee(int empId, String empName, String designation, int salary) {
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.salary = salary;
	}
	
	public void empDetails() {
		System.out.println("Emoloyee Id : " + this.empId);
		System.out.println("Emoloyee Name : " + this.empName);
		System.out.println("Emoloyee Salary : " + this.salary);
		System.out.println("Emoloyee Designation : " + this.designation);
	}
	
	public void bonusSalary() {
		float bonus = 0;
		if(this.salary > 50000) {
			bonus =  salary * 0.1f;
		}
		else {
			bonus = salary * 0.05f;
		}
		
		System.out.println("Congratulations!! you got bonus of " + bonus + ".");
	}
	
	
	
}
