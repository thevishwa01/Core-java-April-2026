package If_Assigment;

public class EvenorOddDiff {
	
	public static void main(String[] args) {
		int a=100;
		int b=20;
	    int large;
	    int small;
		if (a>b) {
			large=a;
			small=b;
		}
		else {
			large=b;
			small=a;
		}
		if (large%2==0) {
			System.out.println(large);
		}
		else {
			System.out.println(small);
		}
}}