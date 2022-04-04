
public class CheckLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// divisible by 4 for all the leap years --ending with 00
		// century year is leap year only when it is divisible by 400
		int year = 2020;
		boolean leap = false;

		if (year % 4 == 0) {

			if (year % 100 == 0) {

				if (year % 400 == 0) {

					leap = true;

				} else {

					leap = false;
				}
			} else {

				leap = true;
			}

		}

		else {

			leap = false;
		}
		if(leap) {
			System.out.println(year+ " Is a leap year");
		}
		else {
			System.out.println(year+ " Is a not a leap year");
		}
	}

}
