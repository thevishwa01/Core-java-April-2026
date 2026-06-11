package Array.BasicArrayQuestions1to25;

public class Que9 {
	public static void main(String[] args) {

		int[] a = { 10, 80, 40, 30, 60, 20, 70, 90 };
		int target = 70;
		for (int i = 0; i < a.length; i++) {

			if (a[i] == target) {
				System.out.println("The Target Digit is : " + a[i] + " at index of : " + i);
				break;

			}

		}

	}

}
