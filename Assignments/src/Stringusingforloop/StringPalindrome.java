package Stringusingforloop;

public class StringPalindrome {
	public static void main(String[] args) {
		
	
	
	String s="aabba";
	
	String original="";
	
for (int i = s.length()-1; i >=0; i--) {

	char ch=s.charAt(i);
	
	original=original+ch;
}
System.out.println(original);
	if (s.equals(original)) {
		System.out.println("It is Palindrom");
		
	}else {
		System.out.println("It is not");
	}
	}
}
//Check if a string is a palindrome (manually).