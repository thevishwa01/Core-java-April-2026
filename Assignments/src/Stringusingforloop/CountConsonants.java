package Stringusingforloop;

public class CountConsonants {

	public static void main(String[] args) {

		String str = "Vishwanath";

		String C = "aeiouAEIOU";

		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (C.indexOf(ch) == -1) {

				count++;

			}

		}
		System.out.println("Given Consonants " + count);

	}

}
          //Count consonants in a string.