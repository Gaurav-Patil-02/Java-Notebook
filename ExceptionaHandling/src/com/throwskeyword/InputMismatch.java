package com.throwskeyword;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {
	public void read() throws InputMismatchException{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any String");
		String str = scan.nextLine();
		int a = Integer.parseInt(str);
		throw new NumberFormatException();
	}
	public static void main(String[] args) {
		InputMismatch im = new InputMismatch();
		im.read();
		

	}

}
