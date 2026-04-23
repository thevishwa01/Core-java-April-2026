package IF_Statement;

import java.util.Scanner;

public class StudentGrad {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
	System.out.println("Check if the number is Divible or not");
		
	int a=s.nextInt();
	
	s.close();
	
		if (a%2==0) {
			System.out.println("It is Divisible by 2");
		}
		else {
			System.out.println("No it is not 53");
		}
	}
}
