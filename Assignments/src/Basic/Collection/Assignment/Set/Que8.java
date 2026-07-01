package Basic.Collection.Assignment.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Que8 {
	public static void main(String[] args) {

		Set<String> l = new HashSet<String>(Arrays.asList("Hi im Vishwanath"));

		int count = 0;
		String v = "aeiou";
		for (String s : l) {
			for (char c : s.toLowerCase().toCharArray()) {
				if (v.indexOf(c) != -1) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
