package WhileLoop;

import java.util.Scanner;

public class Que17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enet value of n to Reverse the number ");
		int n = sc.nextInt();

		int rev = 0;
		while (n != 0) {

			int lastdigit = n % 10;// -Separates the last digit
			rev = rev * 10 + lastdigit;
			n = n / 10;//---Separates the first two digit

		}
		System.out.println(+rev);

	}

}

//Reverse the digits of a number (e.g., 123 → 321).