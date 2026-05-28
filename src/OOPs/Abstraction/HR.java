package OOPs.Abstraction;

public  class HR extends Employee {

	@Override
	public void HRname() {
		System.out.println("HR - Jessica Peirson");
	}

	@Override
	public void HRSalary(int Salary) {
		Salary=Salary*5;
		System.out.println("Salary of HR - "+Salary);
	}

	@Override
	public void Devname() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DevSalary(int Salary) {
		// TODO Auto-generated method stub
		
	}





	
}
