import java.util.Scanner;

public class FindFactorialOfNumber {

	public static void main(String[] args) {
		//!5 = 5*4*3*2*1 = 120
		//!4 = 4*3*2*1 = 24
		//!0 = 1
		
		
		Scanner valueReader = new Scanner(System.in);
		System.out.println("enter the value to get factorial ---");
		int number = valueReader.nextInt();
		getFactorial(number);

	}
	
	public static void getFactorial(int number) {
		int fact = 1;
		
		for(int i = 1; i <= number; i ++) {
			fact = fact * i;
		}
		
		System.out.println("factorial of " + number + " is "+ fact);
		
		
		// using while loop
		int k = 1;
		int fact1 = 1;
		
		while(k <= number) {
			fact1 = fact1 * k;
			k++;
		}
		
		System.out.println("factorial of " + number + " is "+ fact1);
	}

}
