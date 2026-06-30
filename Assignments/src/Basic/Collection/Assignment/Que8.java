package Basic.Collection.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Que8 {
	public static void main(String[] args) {

		List<Integer> l = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21,22, 23, 24, 25));
		int count = 0;
		for (Integer s : l) {
			if (s % 5 == 0 && s % 3 == 0) {
				count++;

			}
		}
		System.out.println("Count of Number that is Divisible by 3 and 5 : " + count);
	}
}
