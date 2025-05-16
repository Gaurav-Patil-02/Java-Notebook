import java.util.Scanner;

public class VehicleType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of wheels (2, 3, 4, 6):");
        int wheels = scanner.nextInt();

        switch (wheels) {
            case 2:
                System.out.println("Vehicle Type: Bike");
                break;
            case 3:
                System.out.println("Vehicle Type: Auto-Rickshaw");
                break;
            case 4:
                System.out.println("Vehicle Type: Car");
                break;
            case 6:
                System.out.println("Vehicle Type: Truck");
                break;
            default:
                System.out.println("Invalid number of wheels");
        }

	}

}
