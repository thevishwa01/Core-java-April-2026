package Collectiona.Que200;

import java.util.ArrayList;
import java.util.List;

public class Que1 {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<Integer>();
		l.add(12);
		l.add(13);
		l.add(14);
		l.add(15);
		l.add(16);
		l.stream().forEach(System.out::println);
	}

}
