package Basic.Collection.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QUe1 {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		for (Integer i : l) {
			System.out.println(i);
		}

	}

}
