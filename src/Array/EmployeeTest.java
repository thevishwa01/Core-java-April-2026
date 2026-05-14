package Array;

public class EmployeeTest {
public static void main(String[] args) {
	
	
	Employee E=new Employee();
	E.EmployeeId=142;
	E.EmployeeName="Prashant";
	E.Designation="SDET";
	E.salary=1250000;

	
	
	Employee E1=new Employee();
	E1.EmployeeId=120;
	E1.EmployeeName="Vishwa";
	E1.Designation="Full Stack Developer";
	E1.salary=1000000;
	
	
	
	Employee E2=new Employee();
	E2.EmployeeId=164;
	E2.EmployeeName="Abhay";
	E2.Designation="Bussiness Analyst";
	E2.salary=1500000;

	
	Employee[] EmployeeDetails= {E,E1,E2};
	
	for(int i=0;i<EmployeeDetails.length;i++) {
		
		Employee ED=EmployeeDetails[i];
		
		System.out.println(ED.EmployeeId);
		System.out.println(ED.EmployeeName);
		System.out.println(ED.Designation);
		System.out.println(ED.salary);
		System.out.println("");
		
	}
	
	
	
	
	
}
	
	
	
}
