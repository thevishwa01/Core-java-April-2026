package OOPs.Abstraction;

public class Developer extends Employee {

	@Override
	public void Devname() {
		System.out.println("Developer name - Alex Colson");
		
	}

	@Override
	public void DevSalary(int Salary) {
		Salary=Salary*10;
		System.out.println("Developer Salary - "+Salary);
		
	}

	@Override
	public void HRname() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void HRSalary(int Salary) {
		// TODO Auto-generated method stub
		
	}



	
}
