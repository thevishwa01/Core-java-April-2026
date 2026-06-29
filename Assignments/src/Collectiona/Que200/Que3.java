package Collectiona.Que200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Que3 {
	public static void main(String[] args) {

		List<String> l = new ArrayList<String>(Arrays.asList("animal", "bird", "fish", "reptile"));

		for (String s : l) {
			System.out.println(s.toUpperCase());
		}

		l.stream().map(n -> n.toUpperCase()).forEach(System.out::println);
		;
	}

}
