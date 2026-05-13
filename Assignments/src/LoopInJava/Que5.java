package LoopInJava;

import java.util.Scanner;

public class Que5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to print Square");
		int a = sc.nextInt();
		int Square = 0;
		for (int i = 1; i <=a; i++) {
			Square = i*i;
			System.out.println(" Square of  "+i+" is "+Square);
		}
	}
}
