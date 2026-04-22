package Scanner;

import java.util.Scanner;

public class UserNameGenerate {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First name : ");
		String fname = sc.next();

		System.out.println("Enter the last name : ");
		String lname = sc.next();

		System.out.println("Enter the Year of Birth : ");
// int Year=yob % 100;--To get the last @ Digits of the Year of Birth 
		int yob = sc.nextInt(); sc.close();

		int Year = yob % 100;
		String Username = fname + lname + Year;
		System.out.println("The User name is " + Username);
		

	}

}
