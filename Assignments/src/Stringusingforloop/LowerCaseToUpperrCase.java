package Stringusingforloop;

public class LowerCaseToUpperrCase {
public static void main(String[] args) {
	
	String s="Hello World";
	String replace="";
	
	
	for (int i = 0; i < s.length(); i++) {

		char ch=s.charAt(i);
		
		if (ch>='A' && ch<='Z') {
			
			replace=replace+Character.toLowerCase(ch);
		
		}
		else if (ch>='a' && ch<='z') {
			replace=replace+Character.toUpperCase(ch);
			
		}
		else {
			replace=replace+ch;
		}
	}
	System.out.println(replace);
}
}
//Convert lowercase to uppercase (and vice versa).