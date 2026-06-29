package Basic.Collection.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Que2 {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>(
				Arrays.asList("Vishwanath", "Aditya", "Rohit", "Prashant", "Ankit", "Nakhil"));

		for (String s : l) {
			if (s.startsWith("A")) {
				System.out.println(s);

			}

		}

	}

}
