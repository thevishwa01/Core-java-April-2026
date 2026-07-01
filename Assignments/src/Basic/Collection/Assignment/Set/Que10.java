package Basic.Collection.Assignment.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Que10 {
	public static void main(String[] args) {

		String l = "Raman Loves Swimming singing and Danceing"; 
		
		Set<String> ll=new HashSet<String>(Arrays.asList(l.split(" ")));

		int count=0;
		String z = "ing";
		for (String s : ll) {
			if( s.toLowerCase().contains(z)) {
				count++;
				System.out.println(s);
			}
		}
		System.out.println("The Number of String Containing 'ing':  "+count);
	}
}
