package String;



public class StringPractice {
public static void main(String[] args) {
	
	
	
	String s="VISHWANATH";

	

	for (int i = 0; i <=s.length()-1; i++) {
		
		System.out.println(s.charAt(i));
	}
	
	System.out.println("========================");
	
	for (int i = s.length()-1; i >=0; i--) {
		
		System.out.println(s.charAt(i));
	}
}
}
