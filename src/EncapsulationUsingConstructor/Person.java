package EncapsulationUsingConstructor;

public class Person {

	private String Name;
	private int Age;

	public Person(String inName, int inAge) {
		this.Name = inName;
		this.Age = inAge;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getName() {
		return Name;
	}

	public int getAge() {
		return Age;

	}

}
