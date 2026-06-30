package Basic.Collection.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Que9 {
	public static void main(String[] args) {

		List<String> l = new ArrayList<String>(Arrays.asList("Mango", "Apple", "Banana", "Apple", "Grape", "Mango",
				"Dragon Fruit", "Peach", "Strawberry", "Peach", "Grape"));

		List<String> u = new ArrayList<String>();

		for (String s : l) {
			if (!u.contains(s)) {
				u.add(s);
			}
		}
		System.out.println(u);
	}

}
