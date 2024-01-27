
public class FindArmStrongNumberBetweenInterval {

	public static void main(String[] args) {
		int low = 00;
		int high = 200;
		
		double result = 0;
		
		for(int i = low ; i < high; i++) {
			int check, remainder = 0;
			check = i;
			
			while(check != 0) {
				remainder = check % 10;
				result = result + (remainder * remainder * remainder);
				check = check / 10;
			}
			
			if(result == i) {
				System.out.println(i + " is arm strong number");
			}
		}
		
	}

}
