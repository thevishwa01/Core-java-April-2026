package LoopInJava;

import java.util.Scanner;

public class que6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number to get cube");

		int a = sc.nextInt();
		int cube = 0;
		for (int i = 1; i <= a; i++) {

			cube = i * i * i;
			System.out.println("Cube of "+i+" is "+cube);
		}
	
	}

}
