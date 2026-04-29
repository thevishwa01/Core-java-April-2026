package ForLoop;

import java.util.Scanner;

public class FactrolValue {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n");
	int n=sc.nextInt(); 
	int Fact=1;
	
	for (int i = 1; i <=n; i++) {
		Fact*=i;
		
	}
	System.out.println("Factrol is "+Fact);
sc.close();
}
}
//Write a program to find the factorial value of any number.