package Stringusingforloop;


public class RemoveSpace {
public static void main(String[] args) {
	
	String s="Hello World";
	String result="";
	for (int i = 0; i <s.length(); i++) {
	 char ch=s.charAt(i);
	 
	 if (ch!=' ') {
		 result=result+ch;
		
	}

	}
	 System.out.println(result);
}
}
//Remove spaces from a string.