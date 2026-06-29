package Basic.Collection.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Que3 {
	public static void main(String[] args) {

		List<Integer> l = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19));
		int sum = 0;
		for (Integer i : l) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("Sum of all Element is : " + sum);
	}

}
