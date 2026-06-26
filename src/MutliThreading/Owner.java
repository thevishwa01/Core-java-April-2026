package MutliThreading;

public class Owner {

	public static void main(String[] args) {

		Employee1 e1=new Employee1();
		Employee2 e2=new Employee2();
		
		
		for (int i = 0; i <=10; i++) {
			
			System.out.println("Vishwa is Taking Order"+i+Thread.activeCount());
		}
		
		e1.start();
		e2.start();
		
		
	}

}
