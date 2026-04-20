package com.java.core;

public class ReturnMethod {
	
	public int Addition() {
		int a=1233;
		int b=12124;
		int Add=a+b;
		return Add;
	}
	
	public int Subtractio() {
		int x=1434;
		int y=1234;
		int Sub=x-y;
		return Sub;
	}
	
	public int AdditionPara(int a,int b) {
		int Add=a+b;
		return Add;
	}
	
	public static void main(String[] args) {
		ReturnMethod RM=new ReturnMethod();
		int Add=RM.Addition();
		System.out.println("Addition of Return Method is "+Add);
		
		int Sub=RM.Subtractio();
		System.out.println("Subtraction of Return Method is "+Sub);
		
	int Addi=RM.AdditionPara(70,30);
		System.out.println("Addition of para is "+Addi);
	}
}
