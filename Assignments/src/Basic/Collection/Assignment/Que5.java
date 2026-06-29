package Basic.Collection.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Que5 {
	public static void main(String[] args) {
		List<Double> l = new ArrayList<Double>(
				Arrays.asList(123.23, 12.5, 876.4, 8.3, 213.3, 87.5, 564.5, 645.4, 234.2, 12.1, 99.99));

		for (Double s : l) {
			if (s > 100) {
				System.out.println(s);
			}
		}
	}
}
