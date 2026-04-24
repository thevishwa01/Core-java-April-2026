package If_Assigment;

public class ATM {

	public static void main(String[] args) {
		int Balance=2000;
		int Amount=10000;
		
		if (Amount%100==0) {
			if (Amount<=Balance) {
				System.out.println("Withdrawal Amount Approved");
				System.out.println("Withdrawal amount" +Amount);
				System.out.println("Available Balance "+(Balance-Amount));
			}else {
				System.out.println("Insufficient Balance");
				System.out.println("Your current Balance"+Balance);
			}
			
		}else {
			System.out.println("Input the Amount in Multiple of 100");
		}
	}
}



//ATM Withdrawal
//Input balance and withdrawal amount.
//If withdrawal is a multiple of 100 and ≤ balance, approve. Else reject.