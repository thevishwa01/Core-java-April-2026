package Encapsulation;

public class Gmail {
	
private String Username="Thevishwa01@gmail.com";

private String Password;



public  String getUsername() {
	return Username;
	
}

public void setPassword(String PassWord) {
	this.Password=PassWord;
	
}

public void PrintPass() {
	System.out.println("PassWord :"+Password);
}


}
