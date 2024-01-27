
public class IsNumberSumOfTwoPrimeNumber {

	public static void main(String[] args) {
		// java proragam to check whether the number is sum of two prime number 
		//34 = 31 +3, 5 +29, 11 +23, 17 + 34
		
		//System.out.println(findPrimeNumber(34));
		int number = 34;
		boolean flag = false;
		for(int i = 2; i <= number /2; i++) {
			if(findPrimeNumber(i)) {
				if(findPrimeNumber(number - i)) {
					System.out.println(number + "= " + i + " + " + (number - i));
					flag = true;
				}
			}
		}
		if(!flag) {
			System.out.println(number + " can  not be experessed as sum of two prime number");
		}

	}
	
	
	public static boolean findPrimeNumber(int number) {
		boolean isPrimeNumber = true;
		
		for(int i = 2; i <= number; i++) {
			if(number % i == 0) {
				isPrimeNumber = false;
				break;
			}
		}
		
		return isPrimeNumber;
	}

}
