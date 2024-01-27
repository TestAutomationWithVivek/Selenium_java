
public class ReverseNumber {

	public static void main(String[] args) {
		int number = 1234;
		int reverse = 0;
		
		while(number != 0) {
			int n = number % 10; //4
			reverse = reverse * 10 + n; //3
			number = number / 10;
			
		}
		System.out.println("Reverse number is = " + reverse);

	}

}
