package Scanner;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter value of a : ");
		
		int a=sc.nextInt();
		System.out.println("Enter value of b :");
		int b=sc.nextInt();
		
		int Sum=a-b;
		System.out.println("The sum is : "+Sum);
	}
}
