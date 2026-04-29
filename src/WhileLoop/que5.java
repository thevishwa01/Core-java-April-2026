package WhileLoop;

import java.util.Scanner;

public class que5 {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number to print table ");
	 int n=sc.nextInt();
	sc.close();
	int i=1;
	while (i<=10) {
		System.out.println(n+"x"+i+"="+ i*n);
		i++;
		
	}
}
}
