package com.classwork;

public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setEmpId(150);
		emp.setEmpName("Somanath");
		emp.setSalary(9000);
		
		System.out.println("Employee Id : " +emp.getEmpId());
		System.out.println("Employee Name : " +emp.getEmpName());
		System.out.println("Employee Salary : " +emp.getSalary());

	}

}
