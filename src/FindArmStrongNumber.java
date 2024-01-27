
public class FindArmStrongNumber {

	public static void main(String[] args) {
		// armsStrongNumber = 153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
		//371
		
		int number = 153;
		int actualNumber = number;
		double result = 0;
		
		while(actualNumber != 0) {
			int remainder = actualNumber % 10;
			result = result + Math.pow(remainder, 3);
			actualNumber = actualNumber / 10;
		}
		System.out.println(result);
		
		if(result == number) {
			System.out.println("number is armstrong");
		} else {
			System.out.println("number is not armstrong");
		}

	}

}
