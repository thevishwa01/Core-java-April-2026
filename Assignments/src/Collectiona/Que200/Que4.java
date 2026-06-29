package Collectiona.Que200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Que4 {
	public static void main(String[] args) {

		List<String> l = new ArrayList<String>(Arrays.asList("Vishwanat", "Ankit", "Makrand", "Ankit", "Kshitij",
				"Abhay", "Dipansh", "Akash", "Anmol"));

		l.stream().filter(n -> n.startsWith("A")).forEach(System.out::println);

		for (String s : l) {
			if (s.startsWith("A")) {
				System.out.println(s);

			}

		}

	}
}
