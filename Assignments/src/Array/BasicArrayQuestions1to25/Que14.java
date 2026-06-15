package Array.BasicArrayQuestions1to25;

public class Que14 {
	public static void main(String[] args) {

		int[] a = { 1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9 };

		for (int i = 0; i < a.length; i++) {

			boolean isduplicate=false;
			
			for (int j = 0; j <i; j++) {
				
				if (a[i]==a[j]) {
					isduplicate=true;
					break;
				}
			
			}
			if (!isduplicate) {
				System.out.println(a[i]);
				
			}
			
		}
		
		
		
		
		
		

	}

}
