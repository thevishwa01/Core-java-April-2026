package If_Assigment;

public class TaxSlab {

	public static void main(String[] args) {
		int income=350000;
		int tax=0;
		
		if (income<=250000) {
			System.out.println("No Tax");
			tax=0;
		}
		else if (income<=500000) {
			tax=income*5/100;
			System.out.println("Tax Slab is 5%");
		}
		else if (income<=1000000) {
			tax=income*20/100;
			System.out.println("Tax slab is 20%");
		}
		else if (income>1000000) {
			tax=income*30/100;
			System.out.println("Tax slab is 30%");	
		}
		System.out.println("Your income "+income);
		System.out.println("Your income after tax is "+(income -tax));
	}
}
//Tax Bracket Checker
//Input income.
//Tax slabs:
//<2.5L: No tax
//2.5L–5L: 5%
//5L–10L: 20%
//10L: 30%