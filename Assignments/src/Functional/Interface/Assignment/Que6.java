package Functional.Interface.Assignment;

import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Function;

public class Que6 {
	public static void main(String[] args) {

		Supplier<Integer> num = new Supplier<Integer>() {

			@Override
			public Integer get() {
				// TODO Auto-generated method stub
				return 12;
			}

		};

		Function<Integer, Integer> cube = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return t * t * t;
			}

		};

		Consumer<Integer> result = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println("Cube is : " + t);

			}

		};

		result.accept(cube.apply(num.get()));

	}
}
