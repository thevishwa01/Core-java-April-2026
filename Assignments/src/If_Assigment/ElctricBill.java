package If_Assigment;


public class ElctricBill {
public static void main(String[] args) {
	int Unit=50;
	int Bill=0;
	if (Unit<=100) {
		Bill=Unit*5;
	}else {
		if (Unit<=300) {
			Bill=Unit*7;
		}else {
			Bill=Unit*10;
		}
	}
	System.out.println("Total Bill is " +Bill);
}
}
//Electricity Bill Calculator
//Input total units consumed.
//Use nested if-else to calculate cost:
//≤100 units: ₹5/unit
//101–300: ₹7/unit
//300: ₹10/unit