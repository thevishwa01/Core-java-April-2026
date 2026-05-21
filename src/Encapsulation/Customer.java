package Encapsulation;

public class Customer {
	private String CustName;
	private int Price;
	private String Date;

	public void setCustName(String CustName) {
		this.CustName = CustName;
	}

	public String getCustName() {
		return CustName;
	}

	public void setPrice(int Price) {
		this.Price = Price;
	}

	public int getPrice() {
		return Price;
	}

	public void setDate(String Date) {
		this.Date = Date;
	}

	public String getDate() {
		return Date;
	}

}
