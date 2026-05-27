package ThisKeyWord;

public class HR extends Employee {

	public HR() {

		String Joiningdate = "Joinind Date = 1-7-2026";
		System.out.println(Joiningdate);
	}

	public HR(String a) {
		this();

	}

	public void Companyname() {
		System.out.println("KPMG");
	}

	String addres = "Hinjwadi Phase - 3";

	public void DataofDeveloper() {
		super.Employee2ID();
		System.out.println(super.name1);
		System.out.println(super.Salary1);
		this.Companyname();
		System.out.println(this.addres);
	}

	public void DataofHR() {
		super.EmployeeID();
		System.out.println(super.name2);
		System.out.println(super.salary2);
		this.Companyname();
		System.out.println(this.addres);
	}

}
