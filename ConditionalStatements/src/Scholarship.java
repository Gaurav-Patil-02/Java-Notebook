import java.util.Scanner;

public class Scholarship {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter marks of student");
		double marks = scan.nextDouble();
		System.out.println("Enter Annual income ");
		double income = scan.nextDouble();
		
		if(marks >= 90 && income <= 300000) {
			System.out.println("your are eligible for scholarship");
		}else {
			System.out.println("your are not eligible for scholarship");
		}
	}
}
