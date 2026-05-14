package Array;

public class CustomerTest {
	
	public static void main(String[] args) {
		
		
		Customer c=new Customer();
		c.Customeid=101;
		c.CustomerName="Alex";
		c.Prodduct="Iphone 17";
		c.Price=117000;

		
		Customer c1=new Customer();
		c1.Customeid=102;
		c1.CustomerName="John";
		c1.Prodduct="MacBook";
		c1.Price=235000;
		
		Customer[]  CustomerDetails= {c,c1};
		for(int i=0;i<CustomerDetails.length ;i++ ) {
			
			Customer ct=CustomerDetails[i];
			
			System.out.println(ct.Customeid);
			System.out.println(ct.CustomerName);
			System.out.println(ct.Prodduct);
			System.out.println(ct.Price);
			
		}
		
		
		
		
	}

}
