package UserName;

public class UserNameGenerator {
	
	public  String getusername(String fname, String lname,int yob) {
		
		int Year=yob % 100;
		String username=fname+lname+Year;
		return username;
	}

	public static void main(String[] args) {
		
	UserNameGenerator generator=new UserNameGenerator();
	String Username=generator.getusername("John","Wick",1991);
	System.out.println("User name is : "+Username );
	
	}
}
