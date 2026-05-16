package Encapsulation;

public class Balance {

	private int balance;

	public void setBalance(int balance) {

		if (balance > 0) {
			this.balance = balance;
		} else {
			System.out.println("Erro this balance cant be 0");
		}

	}

	public int getBalance() {
		return balance;

	}

}
