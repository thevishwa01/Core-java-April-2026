package Stringusingforloop;

public class Vowels {
	public static void main(String[] args) {

		String s = "ENTERPRENURE";
		
		String v = "aeiouAEIOU";
		int count=0;
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (v.indexOf(ch) !=-1) {
				count++;
			}

		}
System.out.println("Vowels in given String are "+count);
	}

}

//1.Count vowels in a string.