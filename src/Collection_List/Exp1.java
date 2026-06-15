package Collection_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exp1 {

	public static void main(String[] args) {

		List<String> l = new ArrayList<String>();

		l.add("Apple");
		l.add("Banana");
		l.add("Grape");

		System.out.println(l);
		String result = "[" + String.join(",", l) + "]";
		for (String string : l) {

			System.out.println(string);

		}

		System.out.println(result);    

		System.out.println("======================");

		List<String> la = new LinkedList<>();

		la.add("Ankit");
		la.add("Abhay");
		la.add("Aditya");

		System.out.println(la);

	}

}
