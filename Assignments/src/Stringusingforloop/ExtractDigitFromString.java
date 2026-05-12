package Stringusingforloop;

public class ExtractDigitFromString {
	public static void main(String[] args) {
		
		String s="theVishwa0101";
		String Extract="";
		for (int i = 0; i <s.length(); i++) {
			
			char ch=s.charAt(i);
			
			if (Character.isDigit(ch)) {
				Extract=Extract+ch;
				
			}
		}
		System.out.println(Extract);
	}

}
