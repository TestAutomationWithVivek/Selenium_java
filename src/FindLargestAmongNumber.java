
public class FindLargestAmongNumber {

	public static void main(String[] args) {
		int a = 42;
		int b = 30;
		int c = 30;
		
		if(a > b && a > c) {
			System.out.println("A is the greatest number");
		}
		else if(b > c) {
			System.out.println("B is the greatest number");
		} 
		else {
			System.out.println("C is the greatest number");
		}
		
		
		if(a >= b) {
			if(a >= c) {
				System.out.println("A is the greatest number");
			} else {
				System.out.println("B is the greatest number");
			}
		}
		else {
			if(b >= c) {
				System.out.println("B is the greatest number");
			} else {
				System.out.println("C is the greatest number");
			}
		}

	}

}
