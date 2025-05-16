import java.util.Scanner;

public class TypeOfTriagle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter all  three sides of the traingle");
		int side_A = scan.nextInt();  
		int side_B = scan.nextInt(); 
		int side_C = scan.nextInt(); 
		
		if(side_A == side_B && side_B == side_C) {
			System.out.println("Above triagle is an Equilateral");
		}else if(side_A == side_B ) {
			System.out.println("Above triagle is an Isoscales");
		}else {
			System.out.println("Above triagle is an Scalene");
		}

	}

}
