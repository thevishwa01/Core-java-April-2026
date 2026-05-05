package If_Assigment;

public class OddChain {
	public static void main(String[] args) {
		
		int a=5;
		int b=7;
		int c=3;
		
		if (a%2==0 && b%2==0 && c%2==0 ) {
			System.out.println("It is Even chain");
		}
		else 	if (a%2==1 && b%2==1 && c%2==1) {
			System.out.println("It is Odd Chain");
		}else {
			System.out.println("It is MIxed chain");
		}
	}

}

//Odd/Even Chain Reaction
//Input three numbers.
//If all are odd → print "Odd Chain".
//If all are even → "Even Chain".
//Else → "Mixed Chain".