
public class Operatorss {
	public static void main(String args[]) {
		
		
		//Logical AND (&&)
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		//Logical OR (||)
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		//Logical NOT (!)
		System.out.println(!true);
		System.out.println(!false);
		
		
		//Increment / Decrement
		int a = 25;
		++a;									//Pre Increment
		a--;									//Post Decrement
		a++;									//Post Increment
		--a;									//Pre Increment
		System.out.println(a);
	}
}
