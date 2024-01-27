import java.util.Scanner;

class integerValueAdditon {
	public int a;
	public int b;
	
	public void addIntegerValue(int value1, int value2) {
		this.a = value1;
		this.b = value2;
		int c = this.a + this.b;
		
		System.out.println("Addition = "+ c);
	}
}

public class PrintIntegerEnteredByUser {

	public static void main(String[] args) {
		integerValueAdditon integerValueAdditon = new integerValueAdditon();
		int value1 = Integer.valueOf(100);
		int value2 = Integer.valueOf(200);
		//integerValueAdditon.addIntegerValue(value1, value2);
	
		Scanner readValues = new Scanner(System.in);
		System.out.println("please enter values");
		int value3 = readValues.nextInt();
		int value4 = readValues.nextInt();
		
		integerValueAdditon.addIntegerValue(value3, value4);

	}
	

}
