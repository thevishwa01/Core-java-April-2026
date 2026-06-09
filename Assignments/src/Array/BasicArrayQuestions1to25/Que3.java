package Array.BasicArrayQuestions1to25;

public class Que3 {
	public static void main(String[] args) {
		
		int[] a= {10,20,37,56,12,54,13};
		int max=a[0];
		
		
		for(int i=0;i<=a.length-1;i++) {
			
			if (a[i]>max) {
				
				max=a[i];
				
			}
			
		}
		System.out.println(max);
		
		
	}

}
