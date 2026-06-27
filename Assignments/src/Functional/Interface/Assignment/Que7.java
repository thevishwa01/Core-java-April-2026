package Functional.Interface.Assignment;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Que7 {
	public static void main(String[] args) {


		Supplier<Integer> num= new Supplier<Integer>() {

			@Override
			public Integer get() {
				// TODO Auto-generated method stub
				return 101;
			}
			
		};
		
		Predicate<Integer> even=new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t%2==0;
			}
		};
		
		Consumer<Integer> print= new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
				System.out.println("Number is Even : "+t);
				
			} 
		};
		
	if (even.test(num.get())) {
		print.accept(num.get());
	}else {
		System.out.println("The Number is Not Even Number "+num.get());
	}
		
		
		
	
	}
}
