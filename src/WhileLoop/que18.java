package WhileLoop;

import java.util.Scanner;

public class que18 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The number to Check ");
		int n = sc.nextInt();

		int rev = 0;
		int original = n;
		while (n != 0) {     

			int lastdigit = n % 10;// last didgit is Extracted
			rev = rev * 10 + lastdigit;// last digit placed
			n = n / 10;// First to digit are extracted

		}
		if (original == rev) {
			System.out.println("The digit is palindrome " + original);

		} else {

			System.out.println("It is NOT !");
		}

	}
}




//Check if a number is a palindrome.