package ForLoop;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to get cube");
		int n=sc.nextInt(); sc.close();
		int cube = 0;
		for (int i =1; i<=n; i++) {
			cube=i*i*i;
			System.out.println("Number is : "+i+" and cube is : "+cube);
		}
		
	}
}
//Write a Java program to display the cube of the given number up to an integer.