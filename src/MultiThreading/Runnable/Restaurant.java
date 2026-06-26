package MultiThreading.Runnable;

public class Restaurant {
	public static void main(String[] args) {

		Employee e = new Employee();
		Thread AlexThread = new Thread(e);
		AlexThread.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("David is Cooking : " + i);
		}

	}
}
