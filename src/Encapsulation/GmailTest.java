package Encapsulation;

public class GmailTest {
	public static void main(String[] args) {

		Gmail g = new Gmail();

		g.getUsername();
		
		g.setPassword("Pass@123");
		

		System.out.println("Username :"+g.getUsername());

		g.PrintPass();
		
	}

}
