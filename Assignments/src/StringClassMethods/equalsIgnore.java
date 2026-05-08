package StringClassMethods;

public class equalsIgnore {
	
	public static void main(String[] args) {
		
		String s="hello world";
		String s1="Hello World";
		System.out.println(s.equalsIgnoreCase(s1));
	}

}
//What will str.equalsIgnoreCase("hello world") return if str = "HelloWorld" ?