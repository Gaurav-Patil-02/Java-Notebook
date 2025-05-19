package com.throwskeyword;


class InsufficientBalanceException extends Exception{
	InsufficientBalanceException (String msg){
		super(msg);
	}
}
public class WithdrawAmount {
	
	public void withdraw(int amount) throws InsufficientBalanceException {
		int balance = 5000;
		if(amount > balance) {
			throw new InsufficientBalanceException("Insufficient Balance");
		}
	}
	public static void main(String[] args) {
		WithdrawAmount w = new WithdrawAmount();
		try {
			w.withdraw(60000);
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
