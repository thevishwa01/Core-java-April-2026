package Basic.Collection.Assignment.Set;

import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

public class Que2 {
	public static void main(String[] args) {

		Set<String> l = new HashSet<>(Arrays.asList("Mango", "Apple", "Banana", "Apple", "Grape", "Mango",
				"Dragon Fruit", "Peach", "Strawberry", "Peach", "Grape"));
		
		for(String s:l) {

			System.out.println(s);
			
		}
	}

}
