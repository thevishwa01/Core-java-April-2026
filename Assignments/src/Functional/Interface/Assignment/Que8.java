package Functional.Interface.Assignment;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Que8 {
	public static void main(String[] args) {

		Supplier<String> pass = new Supplier<String>() {

			@Override
			public String get() {
				// TODO Auto-generated method stub
				return "@Vishwa004";
			}

		};

		Predicate<String> check = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return t.length() > 8;
			}
		};

		Consumer<String> print = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println("Strong Password length is : " + t.length());

			}
		};

		if (check.test(pass.get())) {
			print.accept(pass.get());
		} else {
			System.err.println("Enter Strong Password ");
		}
	}

}
