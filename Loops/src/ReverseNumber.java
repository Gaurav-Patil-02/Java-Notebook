
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 127;
		int reverse = 0;
		int remainder = 0;
		while(num > 0) {
			remainder = num % 10;
			reverse = (reverse * 10) + remainder;
			num = num / 10;
		}
		System.out.println(reverse);
		if(reverse % 2 == 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd"); 
		}
	}

}
