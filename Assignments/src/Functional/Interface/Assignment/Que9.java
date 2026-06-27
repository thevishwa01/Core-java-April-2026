package Functional.Interface.Assignment;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Que9 {
	public static void main(String[] args) {
		Supplier<String> s = new Supplier<String>() {

			@Override
			public String get() {
				// TODO Auto-generated method stub
				return "vishwanath Ingale";
			}
		};

		Function<String, String> f = new Function<String, String>() {

			@Override
			public String apply(String t) {
				// TODO Auto-generated method stub
				return t.toUpperCase();
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
