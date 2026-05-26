package SuperKeyWord;

public class HR extends Employee {
 float s;
 long p;
 
// public HR() {
//	 super(2026);//----> this super called the constructor of Employee Class.
// }
 
 public HR( ) {
	 
	 super(3,"IBM",2026);
 }
 
 
 
	
	public void EmployeeDetails() {
		System.out.println(super.name);
         System.out.println(super.id);
         super.getAge();
         p=super.phonenum(9021812671l);
         s=super.Salary(1500000f);
		
		
	}
	
	

}
