package Basic.Collection.Assignment.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Que6 {
	public static void main(String[] args) {

		Set<String> l = new HashSet<String>(
				Arrays.asList("India", "USA", "Norway", "France", "China", "Canada", "Russia", "England"));
		for (String s : l) {
			if (s.toLowerCase().endsWith("a")) {
				System.out.println(s);
			}
		}
	}
}
