package Functional.Interface.Assignment;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Que5 {
	public static void main(String[] args) {

		Supplier<String> name = new Supplier<String>() {

			@Override
			public String get() {
				// TODO Auto-generated method stub
				return "Vishwanath";
			}
		};

		Predicate<String> p = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return t.startsWith("A");
			}
		};

		Consumer<String> print = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println("Name Accepted");

			}
		};

		if (p.test(name.get())) {
			print.accept(name.get());

		} else {
			System.out.println("Name Not Accepted");
		}

	}
}
