package Functional.Interface.Assignment;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Que15 {
	public static void main(String[] args) {

		Supplier<String> s = new Supplier<String>() {

			@Override
			public String get() {
				// TODO Auto-generated method stub
				return "Admin@Vishwa";
			}
		};

		Predicate<String> p = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return t.toLowerCase().startsWith(t);
			}
		};

		Consumer<String> print = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println("Access Granted");
			}
		};

		if (p.test(s.get().toLowerCase())) {
			print.accept(s.get());
		} else {
			System.err.println("Access Denied");
		}

	}
}
