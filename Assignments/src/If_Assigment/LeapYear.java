package If_Assigment;

public class LeapYear {

	public static void main(String[] args) {

		int year = 2028;
if (year%4==0) {
	if (year%100==0) {
		if (year%400==0) {
			System.out.println("it ise leap year");
			
		}else {
			System.out.println("Not a Leap year");
		}
		
	}else {
		System.out.println("It is a Leap Year");
	}
	
}else {
	System.out.println("It not is Leap Year");
}
	}
}

//Input a year.
//Check if it’s a leap year using nested conditions (divisible by 4, not 100 unless divisible by 400).