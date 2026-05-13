package Stringusingforloop;

public class MostFrequentCharacter {
	public static void main(String[] args) {

		String s = "Hello";
		char mxfrecount=s.charAt(0);
		int maxCount=0;
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int count1 = 0;

			
			
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == ch) {
					count1++;
				}
				}
				if (count1>maxCount) {
					maxCount=count1;
					mxfrecount=ch;
					

				}
				
			}
System.out.println(mxfrecount+":"+maxCount);
	

	}
}
//Find the most frequent character.