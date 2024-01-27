
public class GenerateFibonacciSeries {

	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13 21 34 .....
		// first and second number will always be 0 and 1, later on fibonacci series start
		//(0+1=1) (1+1=2) (1+2=3) (2+3=5).............
		
		int t1 = 0;
		int t2 = 1;
		int fibonnacciSeriesTill = 10;
		
		for(int i = 1; i < fibonnacciSeriesTill; i++) {
			System.out.println(t1);
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}

	}

}
