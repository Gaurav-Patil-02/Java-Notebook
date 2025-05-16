import java.util.Scanner;

public class PerfectSqr {
	
	public static boolean isPerfectSquare(int n) {
		int i = 0;
		while(i * i <= n) {
			if(i * i == n) {
				return true;
			}
			i++;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter any number");
		int n = scan.nextInt();
		
		if(n < 100) {
			System.out.println("Invalid Input");
		}else {
			System.out.println("is Perfect square : " + isPerfectSquare(n));
		}

	}

}
