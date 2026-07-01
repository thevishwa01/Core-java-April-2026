package Basic.Collection.Assignment.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Que11 {
	public static void main(String[] args) {

		String l = "Hii my name is Vishwanath i'm an Engineering Graduate";

		Set<String> z = new HashSet<String>(Arrays.asList(l.split(" ")));

	
		String a = "aeiou";
		String max = "";
		int maxcount=-1;
		
		for (String s : z) {
			int count=0;
			for (char c : s.toLowerCase().toCharArray()) {
				if (a.indexOf(c) != -1) {
					count++;
				}

			}
			if (count>maxcount) {
				maxcount=count;
				max=s;
				
			}
		}
		System.out.println("The word that contains maximum Vowels : "+max);
	}
}
