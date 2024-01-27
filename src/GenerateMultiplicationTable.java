import java.util.Scanner;

public class GenerateMultiplicationTable {
	
	public void generateMultiplicationTable(int numberToGetTable) {
		for(int i = 1; i <= 10 ; i++) {
			int value = numberToGetTable * i;
			System.out.println(numberToGetTable + " * " + i + " = " + value);
		}
	}

	public static void main(String[] args) {
		GenerateMultiplicationTable generateMultiplicationTable = new GenerateMultiplicationTable();
		Scanner valueReader = new Scanner(System.in);
		System.out.println("Enter the value to get multiplication table -- ");
		int numberToGetRead = valueReader.nextInt();
		generateMultiplicationTable.generateMultiplicationTable(numberToGetRead);
	}

}
