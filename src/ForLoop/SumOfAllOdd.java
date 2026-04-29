package ForLoop;

import java.util.Scanner;

public class SumOfAllOdd {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n");
	int n=sc.nextInt();
	int Sum=0;
	
	for (int i = 1; i <n; i+=2) {
         Sum+=i;		
	}
	System.out.println("The Sum of all odd number "+Sum);
	sc.close();
}
}
