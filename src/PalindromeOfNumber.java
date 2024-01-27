
public class PalindromeOfNumber {

	public static void main(String[] args) {
		//palidrome number is the number which looks alike both ends ex 1331, 121, 212 etc
		int number = 1331;
		int reverse = 0;
		
		int actualNumber = number;
		
		while(number != 0) {
			int reminder = number % 10;
			reverse = reverse * 10 + reminder;
			number = number / 10;
		}
		System.out.println(actualNumber+ " =  "+ reverse);
		
		if(reverse == actualNumber) {
			System.out.println("Given number is palidrome number");
		} else {
			System.out.println("Given number is not palidrome number");
		}

	}

}
