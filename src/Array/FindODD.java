package Array;

public class FindODD {

	public static void main(String[] args) {

		int[] Height = { 164, 163, 166, 167, 169, 171, 174, 176, 178 };

		for (int i = 0; i < Height.length; i++) {
			
			if (Height[i]%2==1) {
				System.out.println(Height[i]);
			}
		}

	}

}
