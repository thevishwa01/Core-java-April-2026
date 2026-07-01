package Basic.Collection.Assignment.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Que9 {
	public static void main(String[] args) {

		Set<Integer> l = new HashSet<Integer>(
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19, 20));

		for (Integer i : l) {
			if (i < 2) {
				continue;
			}
			boolean isPrime = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;

				}

			}
			if (isPrime) {
				System.out.println(i);
			}

		}

	}

}
