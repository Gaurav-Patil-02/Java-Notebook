import java.util.Scanner;

public class FibonacciSeries {

	public static boolean isPrime (int n) {
		
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
			
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Nth term");
		int n =  scan.nextInt();
		
		int a = 0, b = 1, next;
		for(int i = 0; i <= n; i++) {
			next = a + b;
			System.out.println("Fibonacci Series : " + a + " ,"  + b);
//			if(isPrime(next)) {
//				break;
//			}
			a = b;
			b = next;
		}
		
	}

}
