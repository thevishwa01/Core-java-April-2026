package Basic.Collection.Assignment.Set;

import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

public class Que7 {
	public static void main(String[] args) {

		Set<Integer> l = new HashSet<>(
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19));

		boolean found = false;

		for (Integer i : l) {
			if (i == 10) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println("10 is Present");
		} else {
			System.out.println("10 is not present");
		}
	}

}
