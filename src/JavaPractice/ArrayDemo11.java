package JavaPractice;

public class ArrayDemo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array1 = {10, 20, 10, 20, 5};
		
		for(int i = 0; i <array1.length; i++) {
			if(array1[i] == 10) {
				System.out.println("Duplicate numbers = " + array1[i]);
				
			}
		}

	}

}
