package OOPs.Abstraction;

public class Test {
	public static void main(String[] args) {
		
		Employee e;
		e=new Developer();
		e.Devname();
		e.DevSalary(10000);
		
		e= new HR();
		e.HRname();
		e.HRSalary(10000);
		
		
		
		
	}

}
