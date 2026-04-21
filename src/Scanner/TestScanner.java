package Scanner;

import java.util.Scanner;

public class TestScanner {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
	System.out.println("Enter the value of a :");
	
	int a=sc.nextInt();
	
	System.out.println("Enter the value of b : ");
	int b=sc.nextInt();
	
	int Sum=a+b;
	System.out.println("The Sum is : "+Sum);
	
	
	int Sub=a-b;
	System.out.println("The Subtraction is : "+Sub);
	
	
		
	}

}



