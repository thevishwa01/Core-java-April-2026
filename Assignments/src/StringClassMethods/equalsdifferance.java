package StringClassMethods;

public class equalsdifferance {
	
	public static void main(String[] args) {
		
		String s="Vishwanath";
		String s1=new String("Vishwanath");
		
		
		System.out.println("--------- When we use equals() -----------");
		System.out.println("s.equalss1 : "+s.equals(s1));
		
		System.out.println("---------- When we use == ----------- ");
		System.out.println("s==s1 : "+(s==s1));
		
		
	}

}
//How does equals() differ from == when comparing two strings ?