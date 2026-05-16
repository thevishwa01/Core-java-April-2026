package Encapsulation;

public class TestInstagram {
	public static void main(String[] args) {
		
		
		
		Instagram i=new Instagram();
		i.Password="abac";
		
		
		
		i.setUSername("Vishwa004");
		String s = i.getUsername();
		
		System.out.println("Username is "+s);
		System.out.println("PassWord is "+i.Password);
		
	}

}
