
public class SwappingOfNumbers {

	public static void main(String[] args) {
		int a = 30;
		int b = 20;
		
		/*
		 * System.out.println("Before swapping  "); System.out.println(a);
		 * System.out.println(b);
		 * 
		 * int temp; temp = a; a = b; b = temp;
		 * 
		 * System.out.println("after swapping ");
		 * 
		 * System.out.println(a); System.out.println(b);
		 */
		
		//without temp
		
		System.out.println("Before swapping  ");
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("after swapping ");
		a = a-b; //-10
		b = a+b; //10
		a = b-a; //20
		
		
		System.out.println(a);
		System.out.println(b);		

	}

}
