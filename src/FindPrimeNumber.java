
public class FindPrimeNumber {

	public static void main(String[] args) {
		int number = 29;
		boolean numberPrimeNumber = true;
		
		//Here, note that we are looping from 2 to num/2.
		//It is because a number is not divisible by more than its half.
		for(int i = 2; i <= number / 2; i++) {
			
			//condition for non prime number 
			//if number is divisible by any number from range 2 to number/2 then loop will break.
			if(number % i == 0) {
				numberPrimeNumber = false;
				break;
			}
		}
		
		System.out.println(numberPrimeNumber);
		
		if(numberPrimeNumber) {
			System.out.println(number + " given number is prime number");
		} else {
			System.out.println(number + " given number is not a prime number");
		}

	}

}
