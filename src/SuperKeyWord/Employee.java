package SuperKeyWord;

public class Employee {

	public Employee(int a, String b,int c) {
		System.out.println("Experiance "+a);
		System.out.println("Last Company "+b);
		System.out.println("Joining Year "+c);

	}

	public Employee(int joinedYEar) {
		System.out.println("Joining Year is " + joinedYEar);

	}

	public String name = "Vishwa";
	public int id = 129;

	public void getAge() {
		System.out.println("Age is 24");
	}

	public long phonenum(long l) {
		return l;

	}

	public float Salary(float Sal) {
		return Sal;
	}

}
