import java.util.Scanner;

public class EligbilityForMarriege {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Age of the person");
		int age = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter Gender");
		String gender = scan.nextLine();
		
		if(gender == "M" || gender == "m") {
			if(age >= 21) {
				System.out.println("You are eligible to marriage");
			}else {
				System.out.println("You are not eligible to marriage");
			}
		}else if(gender == "F" || gender == "f") {
			if(age >= 18) {
				System.out.println("You are eligible to marriage");
			}else {
				System.out.println("You are not eligible to marriage");
			}
		}else {
			System.out.println("Invalid Input");
		}
		

	}

}
