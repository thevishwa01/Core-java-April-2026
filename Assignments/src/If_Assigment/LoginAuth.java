package If_Assigment;

public class LoginAuth {
	public static void main(String[] args) { 
		
		String User="Vishwa";
		String Pass="Pass@123";
		
		String InputUser="Vishwa";
		String InputPass="Pass@123";
		
		if (InputUser.equals(User)) {
			if (InputPass.equals(Pass)) {
				System.out.println("Access granted");
			}else {
				System.out.println("Access Denied: Pass Invalid");
			}
		}else {
			System.out.println("Access Denied : Username Invalid");
		}
	}
}
