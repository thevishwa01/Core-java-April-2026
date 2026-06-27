package Functional.Interface.Assignment;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Que11 {
	public static void main(String[] args) {

		Supplier<Integer> num1 = new Supplier<Integer>() {
			public Integer get() {
				return 10;
			}
		};
		
		Supplier<Integer> num2=new Supplier<Integer>() {
			public Integer get() {
				return 20;
			}
		};

		
	Function<Integer,Integer> f=new Function<Integer, Integer>() {
	
		public Integer apply(Integer t) {
			return t*2 ;
		}
	
	};
		Consumer<Integer> print=new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
		};
		
		print.accept(f.apply(num1.get())+f.apply(num2.get()));
	}

}
