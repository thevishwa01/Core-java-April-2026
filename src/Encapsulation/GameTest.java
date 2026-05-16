package Encapsulation;

public class GameTest {
	public static void main(String[] args) {

		Game g = new Game();

		g.setUsername("Vishwaxoxo");
		String user = g.getUsername();
		
		
		g.setPassWord("@SVishwa0004");
		String pass = g.getPassWord();

		System.out.println("UserName is : " + user);
		System.out.println("PassWord is : " + pass);

	}

}
