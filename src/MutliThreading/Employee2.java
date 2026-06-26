package MutliThreading;

public class Employee2 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("David is Serving " + i + Thread.currentThread());
		}
	}

}
