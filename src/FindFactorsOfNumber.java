
public class FindFactorsOfNumber {

	public static void main(String[] args) {
		// 10 = 1,2,5
		int number = 10;
		
		for(int  i = 1; i <= number; i++) {
			
			if(number % i ==  0) {
				System.out.println(i);
			}
		}

	}

}
