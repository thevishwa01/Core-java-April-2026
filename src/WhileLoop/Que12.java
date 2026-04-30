package WhileLoop;

import java.util.Scanner;

public class Que12 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value to prin the sum of even numbers ");
	int n=sc.nextInt();
	sc.close();
	int Sum = 0;
	int i=2;
	while (i<=n) {
	
		Sum+=i;
		i+=2;
	}
     System.out.println("The of even number is "+Sum);	
}
	
}
//Find the sum of even numbers between 1 and n .