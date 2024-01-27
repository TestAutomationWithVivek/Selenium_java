
public class FindPrimeNumberBetweenRange {

	public static void main(String[] args) {
		int high = 50;
		int low = 20;
		
		
		
		while(low < high) {
			
			boolean primeNummber = false;
			for(int i = 2; i <= low / 2; i ++) {
				//condition for non-prime number
				if(low % i == 0) {
					primeNummber = true;
					break;
				}
			}
			
			if(!primeNummber) {
				System.out.println(low + " ");
			}
			
			low++;
		}

	}

}
