package Array.BasicArrayQuestions1to25;

import java.util.Scanner;

public class Que2 {
	public static void main(String[] args ) {
		Scanner sc=new Scanner(System.in);
		int[] a= new int[5];
		
		System.out.println("Enter 5 Array ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("The Arrays are");
		for (int i = 0; i < a.length; i++) {
			System.out.println("a["+i+"] "+a[i]);
			
		}
		
	}

}
//Read 5 integers from user using Scanner and store them in an array. Print the array.