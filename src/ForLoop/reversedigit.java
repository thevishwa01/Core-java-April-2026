package ForLoop;


import java.util.Scanner;

public class reversedigit {

public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 
	System.out.println("Eneter the Digit to reverse");
	int n=sc.nextInt(); 
	sc.close();
	
    for (int i=n; i>0; i--) {
    	System.out.println(i);
		
	}
}
}
