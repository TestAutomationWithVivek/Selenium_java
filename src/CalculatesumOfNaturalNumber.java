
public class CalculatesumOfNaturalNumber {

	public static void main(String[] args) {
		int value1 = 100;
		int sum = 0;
		
		for(int i = 1; i <= value1; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		System.out.println("--------------------");
		// using while loop
		
		int sum1 = 0;
		int k = 1;
		while(k <= value1) {
			sum1 = sum1 + k;
			k++;
		}
		
		System.out.println(sum1);

	}

}
