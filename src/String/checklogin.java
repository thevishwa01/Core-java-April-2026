package String;

import java.util.Scanner;

public class checklogin {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username");
		String username=sc.next();
		
		System.out.println("Enter Password");
		String Pass=sc.next();
		sc.close();
		
		String Username="test";
		String Password="test123";
		
		
		if (username.equalsIgnoreCase(Username) ) {
			
			if ( Pass.equals(Password)) {
				
			}
			else {
				System.out.println("Invalid Password");
			}
		}
		else {
			System.out.println("Invalid Username");
		}
		
	}

}
