
public class FindLeapYear {

	public static void main(String[] args) {
		// a year divide 4 is called leap year.
		// a year divided by 100 is called century year for example 400,1200,800,
		// every century year is not neccesarrily be leap year for example 1900 etc
		// to check whether century year is leap year we have to divide it by 400.
		
		int year = 8000;
		boolean leapYearStatus;
		
		if(year % 4 == 0) {
			if(year%100 == 0) {
				if(year % 400 == 0) {
					leapYearStatus = true;
				} else {
					leapYearStatus = false;
				}
			} else {
				leapYearStatus = true;
			}
		} else {
			leapYearStatus = false;
		}
		
		if(leapYearStatus) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}

	}

}
