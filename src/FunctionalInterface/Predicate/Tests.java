package FunctionalInterface.Predicate;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Tests {

	public static void main(String[] args) {

		Predicate<Integer> p = (Integer t) -> t % 2 == 0;
		System.out.println("Check the is Even or not : " + p.test(100));

		Predicate<String> p1 = (String z) -> z.startsWith("A");
		System.out.println("String starts with -A- or not : " + p1.test("Vishwanath"));

		Function<Integer, Integer> Square = i -> (i * i);
		System.out.println("Square of digit is : "+Square.apply(7));

		Function<String, String> f1 = t -> t.toUpperCase();
		System.out.println(f1.apply("vishwanath"));

		Function<Integer, Integer> DoubleIt = (Integer i) -> {return i * 2;};
		System.out.println(DoubleIt.apply(4));

		Function<Integer, Integer> TripleIt = (Integer i) -> {return i * 3;};
		System.out.println(DoubleIt.andThen(TripleIt).apply(2));

		Consumer<String> c = (String t) -> { System.out.println(t.toLowerCase());};
		c.accept("vISHWANATH");
		
		Supplier<Integer> s= () -> 106;
        System.out.println(s.get());
        
        Consumer<Integer> cc=(Integer i)->{System.out.println(i);};
        cc.accept(100);
        
        Supplier<String> ss= ()->"Irise";
        System.out.println(ss.get());
	}

}
