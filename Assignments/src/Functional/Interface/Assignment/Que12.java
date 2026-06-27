package Functional.Interface.Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Que12 {
	public static void main(String[] args) {

		Supplier<List<String>> names = new Supplier<List<String>>() {
			public List get() {
				return Arrays.asList("Vishwanath", "Ankit", "Aditya", "Makrad", "Kshitij");
			}
		};

		Consumer<String> print = new Consumer<String>() {

			@Override
			public void accept(String t) {

				System.out.println(t);
			}
		};

		for (int i = 0; i < names.get().size(); i++) {
			print.accept(names.get().get(i));

		}

	}
}
