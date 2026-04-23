package TwoClassVariable;

public class Test2 {
	public static void main(String[] args) {
	
		Customer c=new Customer();
		c.Cuid=01;
		c.Cuname="Ankit";
		c.CuProduct="Iphone 17";
		c.CuPurchasedate="17-05-2026";
		
		System.out.println(c.Cuid);
		System.out.println(c.Cuname);
		System.out.println(c.CuProduct);
		System.out.println(c.CuPurchasedate);
		
		
		System.out.println("");
		
		Customer c1=new Customer();
		c1.Cuid=02;
		c1.Cuname="Abhay";
		c1.CuProduct="PS5";
		c1.CuPurchasedate="18-05-2026";
		
		System.out.println(c1.Cuid);
		System.out.println(c1.Cuname);
		System.out.println(c1.CuProduct);
		System.out.println(c1.CuPurchasedate);
	
	}	
}
