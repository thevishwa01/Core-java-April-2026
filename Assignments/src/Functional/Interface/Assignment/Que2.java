package Functional.Interface.Assignment;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Que2 {
	public static void main(String[] args) {

		Supplier<String> s = new Supplier<String>() {

			@Override
			public String get() {
				// TODO Auto-generated method stub
				return "Vishwanath";
			}
		};

		Function<String, Integer> f = new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {

				return t.length();
			}
		};

		Consumer<Integer> c = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println("The Length of String :  "+t);

			}
		};

		c.accept(f.apply(s.get()));

	}

}
