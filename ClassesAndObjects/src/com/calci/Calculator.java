package com.calci;
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		Addition add = new Addition();
		add.add(14, 17);
		add.add(78, 14);
		System.out.println();
		
		Substraction sub = new Substraction();
		sub.sub(75, 45);
		sub.sub(78, 25);
		System.out.println();
		
		Multiplication mul = new Multiplication();
		mul.mul(48, 75);
		mul.mul(75, 45);
		System.out.println();
		
		Division div = new Division();
		div.div(45, 25);
		div.div(320, 45);
		System.out.println(); 
		
	}

}
