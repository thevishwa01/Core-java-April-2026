package Stringusingforloop;

public class ASCIIsum {
public static void main(String[] args) {
	String s="Hello";
    int Sum=0;
	
	for (int i = 0; i <s.length(); i++) {
		char ch=s.charAt(i);
           
		Sum=Sum+Character.hashCode(ch);
		
	
	}
	System.out.println(Sum);
}
}
