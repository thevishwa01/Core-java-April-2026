package If_Assigment;

import java.util.Scanner;

public class MenuChoice {
	public static void main(String[] args) {
//		int A=10;
//		int B=5;
//		int choice=1;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int A = s.nextInt();
		System.out.println("Enter the 2nd number ");
		int B = s.nextInt();
		System.out.println("Chose the the operation");
		System.out.println("1-Add");
		System.out.println("2-Sub");
		System.out.println("3-Mul");
		System.out.println("4-Div");
		int choice = s.nextInt();  s.close();
		if (choice == 1) {
			System.out.println("Addition : " + (A + B));
		} else if (choice == 2) {
			System.out.println("Subtraction : " + (A - B));
		} else if (choice == 3) {
			System.out.println("Multiplication : " + (A * B));
		} else if (choice == 4) {
			if (B == 0) {
				System.out.println("Cannot Devide by Zero");
			}
			System.out.println("Division :" + (A / B));

		} else {
			System.out.println("Choice is Ivalid");
		}
	}

}

//Menu Choice (Math Ops)
//Input two numbers.
//Input a choice (1: add, 2: subtract, 3: multiply, 4: divide).
//Print result using nested if-else.