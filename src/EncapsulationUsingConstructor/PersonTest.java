package EncapsulationUsingConstructor;

public class PersonTest {
	public static void main(String[] args) {

		Person p=new Person("John",25);
		
		String originalPerson=p.getName();
		
		int age=p.getAge();
		System.out.println("Person Name :"+originalPerson);
		System.out.println("Person Age : "+age);
		
		p.setName("Jane");
	String UpdatedName=p.getName();
		System.out.println("Updated name : "+UpdatedName);
		
		
	}

}
