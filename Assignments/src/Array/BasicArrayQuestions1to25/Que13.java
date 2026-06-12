package Array.BasicArrayQuestions1to25;

public class Que13 {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int[] b = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		int[] c = new int[a.length + b.length ];

		for (int i = 0; i < a.length; i++) {

			c[i] = a[i];
		}

		for (int j = 0; j < b.length; j++) {

			c[a.length + j] = b[j];
		}
		for (int j = 0; j < c.length; j++) {
			System.out.println(c[j]);

		}

		
		
	}
	
	

}
