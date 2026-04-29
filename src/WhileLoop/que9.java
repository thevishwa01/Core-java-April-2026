package WhileLoop;

import java.util.Scanner;

public class que9 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n to print natural number");
		int n=sc.nextInt();
		sc.close();
		
		int i=1;
		while (i<=n) {
			System.out.println(i);
			i++;
			
		}
	}

}
//Print the first n natural numbers.