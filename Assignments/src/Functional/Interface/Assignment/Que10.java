package Functional.Interface.Assignment;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Que10 {
	public static void main(String[] args) {

		Supplier<Double> temp = new Supplier<Double>() {
			public Double get() {
				return 38.01;
			}
		};

		Predicate<Double> check = new Predicate<Double>() {

			public boolean test(Double t) {
				return t > 37.5;
			}
		};

		Consumer<Double> print = new Consumer<Double>() {
			public void accept(Double t) {
				System.out.println("High Temprature " + t);
			}

		};

		if (check.test(temp.get())) {
			print.accept(temp.get());
		} else {
			System.out.println("Low Temprature "+temp.get());
		}

	}
}
