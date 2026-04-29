package ForLoop;

import java.util.Scanner;

public class SumOfAllEven {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n");
	int n=sc.nextInt();
	
	int Sum=0;
	for (int i = 2; i <=n; i+=2) {
		Sum+=i;
	}
	System.out.println("Sum of Even "+Sum);
	sc.close();
}
}
//Write a program to find sum of all even numbers between 1 to n.