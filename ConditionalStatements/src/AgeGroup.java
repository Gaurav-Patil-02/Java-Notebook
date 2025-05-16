
public class AgeGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 78;
		
		 if(age >= 0 && age <= 12) {
			System.out.println("Above person is a child");
		}else if(age >= 13 && age <= 19) {
			System.out.println("Above person is a Teenager");
		}else if(age >= 20 && age <= 59) {
			System.out.println("Above person is a Adult");
		}else {
			System.out.println("Above person is a Senior Citizen");
		}

	}

}
