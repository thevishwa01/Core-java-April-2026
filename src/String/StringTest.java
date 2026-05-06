package String;

public class StringTest {

	public static void main(String[] args) {

		String day = "TUESDAY";
		System.out.println(day);

		// Gives us length of the String "TUESDAY"= 7
	//	int length = day.length();
		System.out.println(day.length());

		// Gives position of the character
		//char charat = day.charAt(3);
		System.out.println(day.charAt(4));

		// Gives us the position of the character at a Digit
//		int indexof = day.indexOf();
//	System.out.println("Digit Position of E char :- " + indexof);

		// To change the upper to lower case
		String tolower = day.toLowerCase();
		System.out.println(tolower);

		// To change upper class
		String toUpper = tolower.toUpperCase();
		System.out.println(toUpper);

		// Last index of Substring
		int lastind = toUpper.lastIndexOf('E');
		System.out.println(lastind);

		// check if lenght is 0
		boolean Empty = day.isEmpty();
		System.out.println(Empty);

		// to get Hash code value
		int hash = day.hashCode();
		System.out.println(hash);

		System.out.println("------------x-----------x---------x-----");
		String a = "@";
		System.out.println(a);
		// index position
		int in = a.indexOf(a);
		System.out.println(in);

		// to get Unicode point at index
		int codep = a.codePointAt(in);
		System.out.println(codep);
	}

}
