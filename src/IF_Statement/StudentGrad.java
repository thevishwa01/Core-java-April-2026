package IF_Statement;

import java.util.Scanner;

public class StudentGrad {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
	System.out.println("Check if the Student is Graduated or not ");
		
	Double Percentage=s.nextDouble();
	
	s.close();
	
		if (Percentage>=40) {
			System.out.println("The Student is Graduated  ✓ ");
		}
		else {
			System.out.println("The Student is Failed X ");
		}
	}
}
