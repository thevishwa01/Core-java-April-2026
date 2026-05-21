package Encapsulation;

public class CustomerTest {
	public static void main(String[] args) {
		
		Customer c=new Customer();
		c.setCustName("Jake");
		c.setPrice(12000);
		c.setDate("17-07-2026");
		
		System.out.println("Name of Customer is : "+c.getCustName());
		System.out.println("Price of Product is : "+c.getPrice());
		System.out.println("Date of Purchase is : "+c.getDate());
		
		
		
	}

}
