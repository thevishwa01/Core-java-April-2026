package If_Assigment;

public class ThreeSizeShapeType {
	public static void main(String[] args) {

		int A = 30;
		int B = 60;
		int C = 30;

		if (A == B && B == C) {
			System.out.println("is equilateral Triangle");
		} else if (A == B||B == C || C == A) {
			System.out.println("Is Isosceles Triangle");
		} else {
			System.out.println("Is scalene Triangle");
		}
	}
}

//Three-Sided Shape Type
//Input 3 sides of triangle.
//Check and classify: equilateral, isosceles, or scalene.