package Inheretance.isA.Relation;

public class Test {
	public static void main(String[] args) {

		Irise i = new Irise();
		System.out.println("Pro of Java Batch : " + i.javaTname);
		System.out.println("Batch time : " + i.BatchTime);
		System.out.println("");
		System.out.println("Pro of FrontEnd Batch : " + i.FETname);
		System.out.println("Batch time : " + i.FBatchTime);
System.out.println("==============================================");
		Student s = new Student();
		System.out.println(s.javaTname);
		System.out.println(s.BatchTime);
		System.out.println(s.Sname);
		System.out.println(s.id);
		System.out.println(s.S1Name);
		System.out.println(s.id1);

		System.out.println("");
		System.out.println(s.FETname);
		System.out.println(s.FBatchTime);
		System.out.println(s.Sname);
		System.out.println(s.id1);
		

	}

}
