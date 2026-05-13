package LoopInJava;

import java.util.Scanner;

public class Que11 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the number to get Sum ");
	
	int a=sc.nextInt();
	int Sum=0;
	for (int i = 0; i <=a; i++) {
		
		Sum=Sum+i;
		
	}
	System.out.println(Sum);
	
}
}
