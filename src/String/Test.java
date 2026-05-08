package String;

public class Test {
	public static void main(String[] args) {

		String s = "Vishwanath";// SCP ---> Same value as "s2"

		String s1 = new String("Vishwanath");// Heap

		String s2 = "Vishwanath";// SCP---Same value Adress as "s"

		String s3 = new String("Vishwanath");// Heap

		System.out.println("s :" + System.identityHashCode(s));
		System.out.println("s1 : " + System.identityHashCode(s1));
		System.out.println("s1 :" + System.identityHashCode(s2));
		System.out.println("s3 :" + System.identityHashCode(s3));

		System.out.println("===========================================");

		System.out.println("s-s1 " + s.equals(s1));
		System.out.println("s-s2 " + s.equals(s2));
		System.out.println("s-s3 " + s.equals(s3));
		System.out.println("s3-s1 " + s3.equals(s1));

		System.out.println("=========================================");

		System.out.println(s == s2);
		System.out.println(s == s1);
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);

	}
}
