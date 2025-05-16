package com.questionsOnMethods;

public class PossitiveOrNegative {
	
	public static void findNumber(int n) {
		if(n == 0) {
			System.out.println("Number is Zero");
		}else if(n > 0) {
			System.out.println("Number is possitive");
		}else {
			System.out.println("Number is Negative");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PossitiveOrNegative.findNumber(95);

	}

}
