package com.thisandsuper;

public class Student {
	String name;
	int age;
	
	
	public Student(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}


	public static void main(String args[]) {
		Student student = new Student("Gaurav", 21);
		System.out.println(student.toString());
	}
	
}
