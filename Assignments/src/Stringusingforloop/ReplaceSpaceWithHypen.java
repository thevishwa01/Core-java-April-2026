package Stringusingforloop;

public class ReplaceSpaceWithHypen {
public static void main(String[] args) {
	
	String s=" Hello World ";
	String replace="";
	for (int i = 0; i <s.length(); i++) {
      char ch=s.charAt(i);
      
      
      if (Character.isSpaceChar(ch)) {
    	  replace=replace+'-';
		
	}else {
		replace=replace+ch;
	}
      
	}
	System.out.println(replace);
}
}
