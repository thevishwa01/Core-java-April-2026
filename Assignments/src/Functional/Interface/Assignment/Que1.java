package Functional.Interface.Assignment;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Que1 {
	public static void main(String[] args) {

		Supplier<Integer> s = () -> 100;

		Predicate<Integer> p = t-> t > 0;

		Consumer<Integer> c = t -> {System.out.println(t+" Positive Number");};
		
		Integer num = s.get();
		if (p.test(num)) {
			c.accept(num);

		} else {
			System.out.println(num+" it is not a Positive number ");
		}
	}

}
