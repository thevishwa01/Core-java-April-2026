package Stringusingforloop;

public class ReplaceDigitWith {
	public static void main(String[] args) {
		
		String s="Abc1A23";
		String replace="";
		
		for (int i = 0; i<s.length(); i++) {
			
			char ch=s.charAt(i);
		if (Character.isDigit(ch)) {
			
			replace=replace+'#';
			
		}else {
			replace=replace+ch;
		}
			
		}
		System.out.println(replace);
	}

}
