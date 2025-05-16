import java.util.Scanner;

public class Palindrome {
	
	public static int sumOfDigits(int n) {
		int sum = 0;
		do {
			sum += n % 10;
			n /= 10;
		}while(n > 0);
		return sum;
	}
	
	public static boolean isPalindrome(int n) {
		int org  = n;
		int reverse = 0;
		while( n > 0) {
			reverse = reverse * 10 + (n % 10);
			n /= 10;
		}
		
		if(reverse == org) {
			return true;
		}
		
		return false;
	}
	
	public static boolean isPrime (int n) {
		if(n == 1) {
			return false;
		}
		
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
			
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter any number");
		int n = scan.nextInt();
		System.out.println("Sum of all Digits in " + n + " : " + sumOfDigits(n));
		System.out.println("is Palindrome? : " + isPalindrome(n));
		System.out.println("is Prime? : " + isPrime(n));
		

	}

}
