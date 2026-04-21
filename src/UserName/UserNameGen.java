package UserName;

public class UserNameGen {

	public String GenerateUsername(String fname, String lname, int yob ) {
		int Year=yob%100;
		String Username=fname+lname+Year;
		return Username;
	}
	
	public static void main(String[] args) {
		UserNameGen generator=new UserNameGen();
		String username=generator.GenerateUsername("Vishwa","Ingale",2001);
		System.out.println("The username is "+username);
	}
}
