
import java.util.Scanner;

public class RechargePlans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("<<<< Select Recharge Plan >>>>");
		System.out.println("1. Data Plan \n2. Talktime Plan \n3. SMS Pack");
		int ch = scan.nextInt();
		
		switch(ch) {
		case 1:
			System.out.println(" <<< Select Data Plan >>>");
			System.out.println("299 : 5Gb , 7days validity \n160 : 5Gb, 2days validity \n77 : 3Gb, 1day validity \n19 : 1Gb , 1day validity  ");
			int dataPlan = scan.nextInt();
			switch(dataPlan) {
			case 299: 
				System.out.println("Recharge of 299 is successful");
				break;
			case 160: 
				System.out.println("Recharge of 160 is successfull");
				break;
			case 77: 
				System.out.println("Recharge of 77 is successfull");
				break;
			case 19: 
				System.out.println("Recharge of 19 is successfull");
				break;
			default: System.out.println("Data plan not found");
			}
			break;
		case 2:
			System.out.println(" <<< Select Talktime Plan >>>");
			
			System.out.println("500 : 423.73 \n100 : 81.75\n10 : 7.47");
			int talkTimePlan = scan.nextInt();
			switch(talkTimePlan) {
			case 500: 
				System.out.println("Recharge of 500 is successful");
				break;
			case 100: 
				System.out.println("Recharge of 100 is successfull");
				break;
			case 10: 
				System.out.println("Recharge of 10 is successfull");
				break;
			
			default: System.out.println("Talktime plan not found");
			}
			break;
		case 3:
			
			System.out.println(" <<< Select SMS Pack >>>");
			
			System.out.println("500 : 450 SMS/Day \n328 : 300 SMS/Day\n59 : 47 SMS/Day");
			int smsPack = scan.nextInt();
			switch(smsPack) {
			case 500: 
				System.out.println("Recharge of 500 is successful");
				break;
			case 328: 
				System.out.println("Recharge of 328 is successfull");
				break;
			case 59: 
				System.out.println("Recharge of 59 is successfull");
				break;
			
			default: System.out.println("SMS pack not found");
			}
			
			break;
		default: System.out.println("Invalid Input");
		
		}

	}

}
