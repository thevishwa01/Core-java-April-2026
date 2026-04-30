package WhileLoop;

import java.util.Scanner;

public class Que16 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n to get the Factrol");
		int n = sc.nextInt();

		sc.close();

		int i = 1;
		int Facto = 1;

		while (i <= n) {

			Facto =Facto* i;
			i++;

		
			
		}
		System.out.println("Factorial of " + n + " is : " + Facto);
	}

}
//Calculate the factorial of a number.