package com.inheritanceday2;

public class MathTeacher extends Teacher {
	public void solvingEqu() {
		System.out.println("Teacher is solving Math Equations...");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathTeacher math = new MathTeacher();
		math.teach();
		math.solvingEqu();

	}

}
