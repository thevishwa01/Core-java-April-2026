package Array.BasicArrayQuestions1to25;

public class Que4 {
	public static void main(String[] args) {

		int[] a = { 21, 45, 12, 667, 25, 56, 216, 25, 11, 754 };

		int min = a[0];

		for (int i = 0; i < a.length; i++) {

			if (a[i] < min) {

				min = a[i];

			}

		}
		System.out.println(min);

	}
}
