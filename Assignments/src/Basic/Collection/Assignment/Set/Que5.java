package Basic.Collection.Assignment.Set;

import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

public class Que5 {
	public static void main(String[] args) {

		Set<String> l = new HashSet<>(Arrays.asList("Even", "odd", "Hari", "Rohit", "Java", "Opps", "Virat"));

		for (String s : l) {
			if (s.length() == 4) {
                 System.out.println(s);   
			}
		}

	}
}
