package Functional.Interface.Assignment;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Que14 {

	public static void main(String[] args) {

		Supplier<Integer> s = new Supplier<Integer>() {
			public Integer get() {
				return 15;
			}
		};

		Predicate<Integer> p = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {

				return t % 3 == 0;
			}
		};

		Predicate<Integer> p1 = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t % 5 == 0;
			}
		};

		Function<Integer, String> f = new Function<Integer, String>() {

			@Override
			public String apply(Integer t) {
				if (p.test(t) && p1.test(t)) {
					return "FizzBuzz";
				} else if (p.test(t)) {
					return "Fizz";

				} else if (p1.test(t)) {
					return "Buzz";

				} else {
					return "Neither";
				}

			}
		};

		Consumer<String> print = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);

			}
		};

		print.accept(f.apply(s.get()));

	}
}
