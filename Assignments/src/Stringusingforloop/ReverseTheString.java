package Stringusingforloop;

public class ReverseTheString {
public static void main(String[] args) {
	
	String s="VISHWANATH";
	String reverse = "";
	for (int i = s.length()-1; i >=0 ; i--) {
         	
		reverse =reverse+s.charAt(i);
	
	}
	System.out.println(reverse);
}

}
