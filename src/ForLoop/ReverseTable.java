package ForLoop;

import java.util.Scanner;

public class ReverseTable {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Number to print reverse table");
		 int n=sc.nextInt();
		 sc.close();
		 
		 for (int i = 10; i >=1; i--) {
			 System.out.println(i*n);
			
		}
	}

}
//Write a program to print reverse tables by taking user input.