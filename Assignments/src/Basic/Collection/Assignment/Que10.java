package Basic.Collection.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Que10 {
	public static void main(String[] args) {

		List<String> l = new ArrayList<String>(
				Arrays.asList("Vishwanath", "om", "Abhikesh", "Rohit", "Makrand", "Ankit", "Abhay","Vishwanathnan"));
		String n = "";
		for (String s : l) {
			if (s.length() > n.length()) {
				n = s;
			}

		}
		System.out.println(n);
	}

}
