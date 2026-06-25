package FunctionalInterface;

public class TestEven {
	public static void main(String[] args) {

		Even e = (int a) -> {return a % 2 == 0;};
        System.out.println(e.num(10));
	}

}
