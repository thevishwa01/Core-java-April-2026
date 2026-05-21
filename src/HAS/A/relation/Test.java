package HAS.A.relation;

public class Test {
	public static void main(String[] args) {

		Car c = new Car();
		c.setChaseNumberCar1("M725175H91734TK");
		c.setMfgyear(2018);
		c.setType("Petrol");

		c.setChaseNumberCar2("JSGD6294764JFF57");
		c.setMfgyear2(2007);
		c.setType2("Diesel");

		c.setChaseNumberCar3("MFG4638825548924");
		c.setMfgyear3(2023);
		c.setType3("Diesel");

		ShowRoom S = new ShowRoom();
		S.setCar1("Audi M1");
		S.setCar1Price(24000000);
		S.setCar2("Porche 911");
		S.setCar2price(50000000);
		S.setCar3("BMW Comption");
		S.setCar3Price(75000000);
		S.setC(c);

		System.out.println(S.getCar1());
		System.out.println(S.getCar1Price());
		System.out.println(S.getC().getChaseNumberCar1());
		System.out.println(S.getC().getMfgyear());

		System.out.println("");

		System.out.println(S.getCar2());
		System.out.println(S.getCar2price());
		System.out.println(S.getC().getChaseNumberCar2());
		System.out.println(S.getC().getType2());
		System.out.println(S.getC().getMfgyear2());
		System.out.println("");

		System.out.println(S.getCar3());
		System.out.println(S.getCar3Price());
		System.out.println(S.getC().getChaseNumberCar3());
		System.out.println(S.getC().getMfgyear3());
		System.out.println(S.getC().getType3());

	}

}
