package FunctionalInterface;

public class Tests {
	public static void main(String[] args) {

		Employee e =  name -> name.toUpperCase();
		System.out.println(e.name("vishwanath"));
	}

}
