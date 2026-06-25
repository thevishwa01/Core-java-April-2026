package Array.BasicArrayQuestions1to25;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Que15 {
	public static void main(String[] args) {

		int[] a = { 4, 5, 3, 6, 9, 2, 3, 2, 6, 9 };

		int sort=0;
		boolean isduplicate = false;

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < i; j++) {

				if (a[i] == a[j]) {

					isduplicate = true;
					break;

				}
			}

			if (!isduplicate) {

			sort=a[i];
			
			
			
			
				System.out.println(sort);
			}
		}

	}

}
