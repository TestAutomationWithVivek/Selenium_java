import java.util.Scanner;

public class CalculatorWithSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner readValues = new Scanner(System.in);
		System.out.println("Enter two numbers");
		double value1 = readValues.nextDouble();
		double value2 = readValues.nextDouble();
		double result = 0;
		
		System.out.println("please enter an operator (+ , -, *, /) = ");
		
		char operator = readValues.next().charAt(0);
		
		switch (operator) {
		case '+':
			result = value1 + value2;
			break;
			
		case '-':
			result = value1 - value2;
			break;
			
		case '*':
			result = value1 * value2;
			break;
			
		case '/':
			result = value1 / value2;
			break;

		default:
			System.out.println("enter specified operator");
			break;
		}
		
		System.out.println(result);

	}

}
