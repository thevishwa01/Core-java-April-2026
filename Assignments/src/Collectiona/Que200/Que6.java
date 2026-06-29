package Collectiona.Que200;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Que6 {
	public static void main(String[] args) {

		List<String> l = new LinkedList<>(
				Arrays.asList("Vishwa", " ", "Prashant", "Anmol", " ", "Rohit", "Aditya", ""));

		l.stream().filter(n -> n != null && !n.trim().isEmpty()).forEach(System.out::println);
	}

}
