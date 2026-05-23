package RunTime.Polymorphism;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Teacher or Princial to print salary ");

		String n = sc.next();
		
		School s;
		
		if (n.equalsIgnoreCase("Teacher")) {
			s=new School();
			s.salary();
			
			s=new Teacher();
			s.salary();
			
		}else if (n.equalsIgnoreCase("Principal")) {
			s=new Principal();
			s.salary();
			
		}

	}

}
