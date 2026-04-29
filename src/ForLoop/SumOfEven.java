package ForLoop;

import java.util.Scanner;

public class SumOfEven {
	 public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the value of n");
		 int n=sc.nextInt();
		 int Sum=0;
		 for (int i = 1; i <=n; i++) {
			 Sum+=i;
		}
		 System.out.println("Sum of All Even number "+Sum);
		 sc.close();
	}

}
//Write a program to find sum of all natural numbers between 1 to n.