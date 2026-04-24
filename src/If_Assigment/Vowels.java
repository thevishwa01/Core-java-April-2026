package If_Assigment;

import java.util.Scanner;

public class Vowels {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Character");
	char ch=s.next().charAt(0);
	s.close();
	char lower= Character.toLowerCase(ch);
	if (lower=='a' || lower=='e' || lower=='i' || lower=='o' || lower=='u') {
		System.out.println("The character is Vowel");
	}
	else {
		System.err.println("The character is Consonent");
	}
}
}
