package Array.BasicArrayQuestions1to25;

public class QUe6 {
	public static void main(String[] args) {

		int[] a = { 10, 20, 23, 53, 25, 53, 78, 75, 97 };

		int sum = 0;

		for (int i = 0; i < a.length; i++) {

			sum += a[i];

		}
		double Avg = (double) sum / a.length;

		System.out.println(Avg);
	}

}
