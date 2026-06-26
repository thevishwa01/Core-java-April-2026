package MutliThreading;

public class Employee1 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Alex is Cooking " + i + Thread.currentThread());

		}
	}

}
