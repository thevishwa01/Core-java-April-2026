package Stream.API.BasicsQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Que2 {
	public static void main(String[] args) {

		List<Integer> l = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

//		l.stream().filter(n->n%2==0).forEach(System.out::println);

		for (Integer n : l) {
			if (n % 2 == 0) {
				System.out.println(n);

			}

		}

	}

}
