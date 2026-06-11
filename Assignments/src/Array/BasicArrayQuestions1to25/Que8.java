package Array.BasicArrayQuestions1to25;

public class Que8 {
	public static void main(String[] args) {
		
		int[] a= {-1,2,3,-5,-2,9,10,-7,-11,-8};
		
		int Pcount=0;
		int Ncount=0;
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i]>0) {
				Pcount++;
				}else {
					
					Ncount++;
				}
			}
		System.out.println("Positive digits are : "+Pcount);
		System.out.println("Negative digits are : "+Ncount);
		}
	}


