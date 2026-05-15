package Array;

public class IriseTest {
	
	public static void main(String[] args) {
		
	Irise I=new Irise();
	I.Studentid=129;
	I.phone=9751266712l;
	I.Stname="Vishwanath";
	I.Course="Full Stack";
		
	
	Irise I1=new Irise();
	I1.Studentid=130;
	I1.phone=8479153012l;
	I1.Stname="Prashant";
	I1.Course="Testing ";
	
	
	
	Irise[] irise= {I,I1};
	for (int j = 0; j < irise.length; j++) {
		Irise ir=I=irise[j];
		System.out.println(ir.Studentid);
		System.out.println(ir.phone);
		System.out.println(ir.Stname);
		System.out.println(ir.Course);
		System.out.println("");
	}
		
		
	}
	

}
