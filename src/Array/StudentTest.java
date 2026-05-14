package Array;

public class StudentTest {

	public static void main(String[] args) {

		StudentArray s = new StudentArray();
		s.id = 101;
		s.name = "Vishwa";
        s.marks=95.40;
        
        
		StudentArray s1 = new StudentArray();
		s1.id = 102;
		s1.name = "Ankit";
        s1.marks=88.40;
        
		StudentArray[] S = { s, s1 };
		for (int i = 0; i < S.length; i++) {
			StudentArray St=S[i];
			
			System.out.println(St.id);
			System.out.println(St.name);
			System.out.println(St.marks);
		}

	}
}
