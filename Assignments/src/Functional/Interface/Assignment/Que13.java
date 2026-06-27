package Functional.Interface.Assignment;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Que13 {
	public static void main(String[] args) {
		Supplier<String> s = new Supplier<String>() {

			@Override
			public String get() {
				// TODO Auto-generated method stub
				return "ababa";
			}
		};

		Function<String, Boolean> f = new Function<String, Boolean>() {

			@Override
			public Boolean apply(String t) {
				String rev = "";
				// TODO Auto-generated method stub
				for (int i = t.length() - 1; i >= 0; i--) {
					rev = rev + t.charAt(i);

				}
				return t.equals(rev);
			}
		};

		Consumer<Boolean> print = new Consumer<Boolean>() {

			@Override
			public void accept(Boolean t) {
				if (t) {
					System.out.println(" It is Palindrome");
				} else {
					System.out.println(" It is not Palindrome");
				}

			}
		};

		print.accept(f.apply(s.get()));

	}
}
