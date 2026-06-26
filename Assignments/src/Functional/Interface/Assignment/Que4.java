package Functional.Interface.Assignment;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Que4 {
	public static void main(String[] args) {

		Supplier<Integer> age = new Supplier<Integer>() {

			@Override
			public Integer get() {
				// TODO Auto-generated method stub
				return 25;
			}
		};

		Predicate<Integer> p = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t > 18;
			}
		};

		Consumer<Integer> result = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println("Eligible to vote");

			}

		};
		
		
		
		if (p.test(age.get())) {
			result.accept(age.get());
			
		}else {
			System.out.println("Not Eligible !");
		}

	}
}
