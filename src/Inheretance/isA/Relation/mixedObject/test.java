package Inheretance.isA.Relation.mixedObject;

public class test {
	public static void main(String[] args) {

		College c = new Student();
		c.DeptName1();
		c.DeptName2();

		System.out.println(c.CollegeName);
		System.out.println(c.CollegeNo);
		System.out.println(c.Address);
	}
}
