package ForLoop;

import java.util.Scanner;

public class SumOfNaturalNum {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n to print sum");
		int n=sc.nextInt(); sc.close();
		 int Sum=0;
		
		for (int i =1; i <n; i++) {
			 Sum+=i;
			
		}
		System.out.println("Sum : "+Sum);
		
		
		
		}
		
	}

//Write a program to find sum of all natural numbers between 1 to n.