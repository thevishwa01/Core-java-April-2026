package ForLoop;

import java.util.Scanner;

public class Table {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Digit to print table");
	int n=sc.nextInt(); sc.close();
	
	for (int i =1; i <=10; i++) {
		System.out.println(i*n);
		
	}
}
}
//Write a program to print tables by taking user input
