package Encapsulation;

public class CarTest {
	public static void main(String[] args) {
		
		Car c=new Car();
		
		c.setBrand("BMW");
		
		String Carname=c.getBrand();
		System.out.println(Carname);
		
		
		c.setYear(1995);
		
		int Year=c.getYear();
		System.out.println(Year);
		
		
	}

}
