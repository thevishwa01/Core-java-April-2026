package If_Assigment;

public class AgeCatogory {
	public static void main(String[] args) {
		int Age=6;
		
		
	if (Age<=12) {
		System.out.println("Age Category is Child");
	}
	else if(Age<=17) {
		System.out.println("Age Category is Teen");
	}
	else if(Age<=59) {
		System.out.println("Age Category is Adult");
	}
	else {
		System.out.println("Age Category is Senior");
	}
	}

}
//Age Category Checker
//Input age.
//Categorize:
//0–12: Child
//13–17: Teen
//18–59: Adult
//60+: Senior