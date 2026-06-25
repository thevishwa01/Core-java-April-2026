package FunctionalInterface;

public class AdditionIMP {
	public static void main(String[] args) {

		Addition a = new Addition() {

			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}

		};
		
		System.out.println(a.add(12, 88));
		

	}

}
