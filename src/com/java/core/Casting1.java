package com.java.core;

public class Casting1 {
	public static void main(String[] args) {
//byte->int->short->long->float->double->boolean		

//byte to int -------------------------------------
   	byte a=120;
   	short b=a;
   	System.out.println(b);	
//int to long---------------------------------------
   	int c=22;
   	long d=c;
   	System.out.println(d);
   	
//long to float--------------------------------------
     long e=2343235l;
     float f=e;
     System.out.println(f);
// float to double------------------------------------
    float g=23.45f;
    double h=g;
    System.out.println(h);

//-------x-------x---------x----------x-------x---------x------
    System.out.println("x----large Data type to Small Data type------x");
//short to byte----------------------------------
short sh=1245;
byte bt=(byte)sh;
System.out.println(bt);

//long to int-------------------------------------
 long lg=78164586l;
 int i=(int)lg;
 System.out.println(i);
 
//float to long-----------------------------------

 float ft=123.245f;
 long lo=(long)ft;
 System.out.println(lo);
 
//double to float---------------------------------

 double x=12436.4124124;
 float y=(float)x;
 System.out.println(y);
 
 
	}

}
