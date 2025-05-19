package com.throwskeyword;

public class ThrowArithmeticException {
	public void divide(int a, int b) throws ArithmeticException{
		if( b == 0) {
			throw new ArithmeticException();
		}else System.out.println("division " + a / b);
	}
	public static void main(String[] args) {
		ThrowArithmeticException th = new ThrowArithmeticException();
		th.divide(10, 0);
		

	}

}
