package WhileLoop;

import java.util.Scanner;

public class Que15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter to value of n to get  sum of given number ");
		int n = sc.nextInt();
		sc.close();

		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n = n / 10;
		}
		System.out.println("The sum of given digits are " + sum);

	}

}

//Find the sum of digits in a given number.