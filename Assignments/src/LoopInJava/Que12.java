package LoopInJava;

import java.util.Scanner;

public class Que12 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to get the sum of Even number ");

		int a = sc.nextInt();
		int Sum = 0;
		for (int i = 2; i <= a; i += 2) {

			Sum = Sum + i;

		}
		System.out.println(Sum);
		sc.close();
	}
}
