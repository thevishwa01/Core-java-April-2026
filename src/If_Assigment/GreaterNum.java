package If_Assigment;

public class GreaterNum {

	public static void main(String[] args) {
		int a = 22585;
		int b = 1254;
		int c = 752;
		if (a > b) {
			if (a > c) {
				System.out.println(a);
			}

		}
		if (b > c) {
			if (b > a) {
				System.out.println(b);
			}
		}
		if (c > b) {
			if (c > a) {
				System.out.println(c);
			}

		}
	}
}


//Biggest Among Three
//Input 3 numbers.
//Use nested if-else to find and print the greatest number.