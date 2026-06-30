package Basic.Collection.Assignment.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Que1 {
	public static void main(String[] args) {

		Set<Integer> l = new HashSet<Integer>(
				Arrays.asList(1, 2, 3, 3, 4, 5, 2, 4, 6, 4, 7, 8, 2, 2, 7, 2, 5, 1, 9, 8, 5, 7, 4, 3, 2, 1));

		System.out.println(l);

		for (Integer s : l) {
			System.out.println(s);

		}

	}

}
