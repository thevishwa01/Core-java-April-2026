package WhileLoop;

import java.util.Scanner;

public class Que11 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n = sc.nextInt();
		sc.close();
		int i = 1;
		int Sum = 0;
		while (i <= n) {
			Sum += i;
			i++;
		}
		System.out.println("The Sum of number is " + Sum);
	}
}
//Find the sum of numbers from 1 to n .