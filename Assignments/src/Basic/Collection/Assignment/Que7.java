package Basic.Collection.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Que7 {
	public static void main(String[] args) {

		List<String> l = new ArrayList<String>(Arrays.asList("nokia", "apple", "samsung", "motorola", "one-plus"));

		for (String s : l) {

			System.out.println(s.toUpperCase());

		}

	}
}
