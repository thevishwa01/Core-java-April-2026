package WhileLoop;

import java.util.Scanner;

public class que13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n to get the sum of odd number ");
		int n = sc.nextInt();
		sc.close();

		int i = 1;
		int Sum = 0;
		while (i <= n) {

			Sum += i;
			i += 2;
		}
		System.out.println("The Sum of odd number : " + Sum);

	}

}

//Find the sum of odd numbers between 1 and n .
