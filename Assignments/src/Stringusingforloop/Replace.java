package Stringusingforloop;

public class Replace {
public static void main(String[] args) {
	
	String s="Vishwanath";
	String result="";
	for (int i = 0; i < s.length(); i++) {
		char ch=s.charAt(i);
		
		if (ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I'|| 
		    ch=='o' || ch=='O' || ch=='U' || ch=='u') {
		
			result=result+'*';
		}else {
			result=result+ch;
		}
		
	}
	System.out.println(result);
}
}
//Replace all vowels with '*'.