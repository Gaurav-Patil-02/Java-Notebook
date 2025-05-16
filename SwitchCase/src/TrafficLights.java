import java.util.Scanner;

public class TrafficLights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter color");
		String clr = scan.nextLine();
		
		switch(clr) {
		case "red" : 
			System.out.println("Stop!");
			break;
		case "yellow" : 
			System.out.println("Slow down!");
			break;
		case "green" : 
			System.out.println("Go!");
			break;
		default:
			System.out.println("Invalid Entry");
		}

	}

}
