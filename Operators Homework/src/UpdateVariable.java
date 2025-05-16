
//Write a java program to take an integer 
//and update it step by step using assignment operators and display the intermediate results
public class UpdateVariable {
	public static void main(String args[]) {
	int a = 14;
	
	a += 12;
	a -= 17;
	a *= 36;
	a /= 22;
	a %= 12;
	
	System.out.println("Updated Variable 'a' : " + a);
	}
}
