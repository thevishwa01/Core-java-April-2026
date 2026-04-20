package com.java.core;

public class MethodClassOperation {
	public void Subtraction () {
		int a =75;
		int b=25;
		int sub=a-b;
	System.out.println("The Subtraction is "+sub);
	}
	
public void Addition() {
	int c=30;
	int d=30;
	int Add=c+d;
	System.out.println("Addition is "+Add);
}
public void Multiplicatio() {
	int e=35;
	int f=2;
	int Mul=e*f;
	System.out.println("Multiplication is "+Mul);	
}
public void Division() {
	int g=160;
	int h=2;
	int Div=g/h;
	System.out.println("Division is "+Div);
	
}
//-----------------------X----Void Parameterized---------
private void AddPara(int x,int y) {
	int add=x+y;
	System.out.println("The value of AddPara "+add);
	
}

public static void main(String[] args) {
	MethodClassOperation op=new MethodClassOperation();
	op.Subtraction();
	op.Addition();
	op.Multiplicatio();
	op.Division();
	
//--------------------X----Void Parameterized---------
	op.AddPara(30,75);
}
}
