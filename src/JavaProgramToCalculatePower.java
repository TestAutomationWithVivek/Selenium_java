import java.util.Scanner;

public class JavaProgramToCalculatePower {
	public static  void calculatePowerOfNumber(int base, int exponent) {
		
		int powerOfNumber = 1;
		for(int i = 1; i <= exponent; i++) {
			powerOfNumber = powerOfNumber * base;
		}
		
		//double powerOfNumber =  Math.pow(base, exponent);
		System.out.println(powerOfNumber);
		System.out.println(exponent + " power of " + base + " is" + " =  " + powerOfNumber);
	}

	public static void main(String[] args) {
		Scanner valueReader = new Scanner(System.in);
		System.out.println("Enter the value to find square");
		System.out.println("Enter base value ----");
		int baseNumber = valueReader.nextInt();
		System.out.println("Enter exponetial value ----");
		int exponentialNumber = valueReader.nextInt();
		calculatePowerOfNumber(baseNumber, exponentialNumber);
	}

}
