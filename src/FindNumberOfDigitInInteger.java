
public class FindNumberOfDigitInInteger {

	public static void main(String[] args) {
		// 12345647 = 7
		// 1234 = 4
		// 123 = 3
		
		int number = 64664655; 
		int count = 0;
		
		while (number != 0) {
			number = number/10;
			count++;
		}
		System.out.println("number of digits " + count);

	}

}
