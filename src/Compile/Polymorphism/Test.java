package Compile.Polymorphism;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Calculator c = new Calculator();

		Scanner sc = new Scanner(System.in);
		System.out.println("Select whic operation u want + ,- , * , / ");
		String op = sc.next();

		System.out.println("Enter how many digit Operation u want");
		int n = sc.nextInt();

		if (n >= 6 || n<2) {

			System.err.println("Value given is Outof Range Enter value from 2 to 5");

		}

		int[] value = new int[n];
		for (int i = 0; i < n; i++) {
			value[i] = sc.nextInt();

			
		}
		

		if (op.equals("+")) {
			if (n == 2) {
				c.Sum(value[0], value[1]);
			} else if (n == 3) {
				c.Sum(value[0], value[1], value[2]);
			} else if (n == 4) {
				c.Sum(value[0], value[1], value[2], value[3]);
			} else if (n == 5) {
				c.Sum(value[0], value[1], value[2], value[3], value[4]);
			}

		}
		if (op.equals("-")) {
			if (n == 2) {
				c.Sub(value[0], value[1]);
			} else if (n == 3) {
				c.Sub(value[0], value[1], value[2]);
			} else if (n == 4) {
				c.Sub(value[0], value[1], value[2], value[3]);
			} else if (n == 5) {
				c.Sub(value[0], value[1], value[2], value[3], value[4]);
			}

		}

		if (op.equals("*")) {
			if (n == 2) {
				c.Mul(value[0], value[1]);
			} else if (n == 3) {
				c.Mul(value[0], value[1], value[2]);
			} else if (n == 4) {
				c.Mul(value[0], value[1], value[2], value[3]);
			} else if (n == 5) {
				c.Mul(value[0], value[1], value[2], value[3], value[4]);
			}

		}

		if (op.equals("/")) {
			if (n == 2) {
				c.Div(value[0], value[1]);
			} else if (n == 3) {
				c.Div(value[0], value[1], value[2]);
			} else if (n == 4) {
				c.Div(value[0], value[1], value[2], value[3]);
			} else if (n == 5) {
				c.Div(value[0], value[1], value[2], value[3], value[4]);
			}

		}

	}
}