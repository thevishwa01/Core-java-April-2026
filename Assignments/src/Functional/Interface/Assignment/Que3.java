package Functional.Interface.Assignment;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Que3 {
	public static void main(String[] args) {

		Supplier<Double> price = new Supplier<Double>() {

			@Override
			public Double get() {
				// TODO Auto-generated method stub
				return 500.0;
			}
		};

		Predicate<Double> p = new Predicate<Double>() {

			@Override
			public boolean test(Double t) {
				// TODO Auto-generated method stub
				return t > 1000;
			}
		};

		Function<Integer, Integer> dis = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return t- (t / 100) * 10;
			}
		};

		Consumer<Integer> Fprice = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println("The Discounted Price is : " + t);

			}
		};

		double orgprice=price.get();
		
		if (!p.test(orgprice)) {
			Fprice.accept(dis.apply((int) orgprice));
			
		}else {
			System.out.println("The Price is above 1k "+orgprice);
		}
		
		

	}

}
