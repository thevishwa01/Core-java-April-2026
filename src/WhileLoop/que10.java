package WhileLoop;

import java.util.Scanner;

public class que10 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value of n to print even number");
	int n=sc.nextInt();
	sc.close();
	
	int i=2;
	while (i<=n) {
		System.out.println(i);
		i+=2;
		
	}
}
}
//Print the first n even numbers.