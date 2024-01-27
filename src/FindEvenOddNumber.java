import java.util.Scanner;

public class FindEvenOddNumber {

	public static void main(String[] args) {
		Scanner readValues = new Scanner(System.in);
		
		System.out.println("Please enter the value ");
		int userValue = readValues.nextInt();
		if(userValue % 2 == 0) {
			System.out.println("value is even");
		}else {
			System.out.println("value is odd");
		}

	}

}
