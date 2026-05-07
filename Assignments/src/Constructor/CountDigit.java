package Constructor;

public class CountDigit {
	
	public static void main(String[] args) {
		
		String s="QWER1244Q3ed";
		
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			
		char ch=s.charAt(i);
			
			if (Character.isDigit(ch)) {
				
				count++;
				
			}
			
		}
		System.out.println("The Digit in Given String are  "+count);
		
	}

}
//Count digits in a string.