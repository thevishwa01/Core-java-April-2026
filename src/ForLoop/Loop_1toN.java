package ForLoop;

import java.util.Scanner;

public class Loop_1toN {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n=sc.nextInt();
		sc.close();
		for (int i = 0; i <=n; i++) {
			System.out.println("Loop"+i);
			
		}
		

	}
}


//Write a program to print all natural numbers from 1 to n (n is a user input).