package Stream.API.BasicsQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Que5 {
	public static void main(String[] args) {

		List<Integer> l = new ArrayList<Integer>(Arrays.asList(5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19));

		long count = l.stream().filter(n -> n > 10).count();
		System.out.println(count);
		int c = 0;
		for (Integer i : l) {

			if (i > 10) {
				c++;

			}

		}
		System.out.println(c);
	}
}
