package Basic.Collection.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Que6 {
	public static void main(String[] args) {

		List<Integer> l = new ArrayList<Integer>(
				Arrays.asList(12, 232, 435, 7, 8, 43,  6, 8, 69, 46, 6, 75, 8, 352, 534, 32, 35, 2));
		int max = 0;
		int min=0;
		for (Integer i : l) {
			if (i > max) {
				max = i;
			}if (i<min) {
				min=i;
			}
		}
		System.out.println("Maximum Digit among the List "+max);
	    System.out.println("Minimum Digit among the List "+min); 
	}

}
