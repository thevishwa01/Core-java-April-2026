package LoopInJava;

import java.util.Scanner;

public class Que8 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number ");
	
	int a=sc.nextInt(); 
	
	for (int i = 0; i <=a; i++) {
		
		if (i%5==0) {
			
		}else {
			System.out.println(i);
			sc.close();
		}
	}

	
}
}
