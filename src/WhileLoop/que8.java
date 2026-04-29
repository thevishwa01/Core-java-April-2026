package WhileLoop;

import java.util.Scanner;

public class que8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to print cube");
		int n=sc.nextInt();
		sc.close();
		
		int i=1;
		while (i<=n) {
			System.out.println("Cube of "+i+" is : "+i*i*i);
			i++;
			
		}
	}

}
//Print the cube of all numbers from 1 to n (user input).