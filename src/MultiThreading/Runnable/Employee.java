package MultiThreading.Runnable;

public class Employee implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Alex is Serving : " + i + " " + Thread.currentThread());

		}
	}

}
