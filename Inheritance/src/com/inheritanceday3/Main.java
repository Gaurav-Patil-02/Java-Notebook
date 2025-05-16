package com.inheritanceday3;

public class Main {
	public static void allInfo() {
		Student stud = new Student();
		Employee emp = new Employee();
		stud.studentInfo();
		stud.personInfo();
		emp.empInfo();
	}
	
	public static void main(String args[]) {
		allInfo();
	}
}
