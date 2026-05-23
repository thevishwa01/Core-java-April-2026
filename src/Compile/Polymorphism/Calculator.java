package Compile.Polymorphism;

public class Calculator {

	public void Sum(int a, int b) {
		System.out.println(a + b);
	}

	public void Sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public void Sum(int a, int b, int c, int d) {
		System.out.println(a + b + c + d);
	}

	public void Sum(int a, int b, int c, int d, int e) {
		System.out.println(a + b + c + d + e);

	}
//-------Mul
	public void Mul(int a, int b) {
		System.out.println(a * b);
	}

	public void Mul(int a, int b, int c) {
		System.out.println(a * b * c);
	}

	public void Mul(int a, int b, int c, int d) {
		System.out.println(a * b * c * d);
	}

	public void Mul(int a, int b, int c, int d, int e) {
		System.out.println(a * b * c * d * e);
	}
//-------SUB
	public void Sub(int a, int b) {
		System.out.println(a - b);
	}

	public void Sub(int a, int b, int c) {
		System.out.println(a - b - c);
	}

	public void Sub(int a, int b, int c, int d) {
		System.out.println(a - b - c - d);
	}

	public void Sub(int a, int b, int c, int d, int e) {
		System.out.println(a - b - c - d - e);
	}
	
//-------DIV
		public void Div(int a, int b) {
			System.out.println(a / b);
		}

		public void Div(int a, int b, int c) {
			System.out.println(a / b / c);
		}

		public void Div(int a, int b, int c, int d) {
			System.out.println(a / b / c / d);
		}

		public void Div(int a, int b, int c, int d, int e) {
			System.out.println(a / b / c / d / e);
		}
}
