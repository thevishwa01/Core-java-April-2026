package Basic.Collection.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Que4 {
	public static void main(String[] args) {

		List<String> l = new ArrayList<String>(
				Arrays.asList("Rohit", "Virat", "MS Dhoni", "Vaibhav", "Ravindra", "Om", "Dorthy", "Vishwanath"));

		for (String s : l) {
			if (s.length() > 5) {

				System.out.println(s);
			}
		}

	}
}
