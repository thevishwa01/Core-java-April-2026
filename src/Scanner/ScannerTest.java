package Scanner;

import java.util.Scanner;

public class ScannerTest {
public static void main(String[] args) {
	
	//int total=0;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name of Studen to get Details ");
	
	System.out.println("Enter the name of Student ");
	String Name=sc.nextLine();
	System.out.println("Enter the Rollno of Student ");
	int Roll=sc.nextInt();
	
	System.out.println("Enter Marks of Science ");
	float Science=sc.nextFloat();
	
	System.out.println("Enter Marks of Maths");
	float Maths=sc.nextFloat();
	
	System.out.println("Enter Marks of English ");
	float English=sc.nextFloat();
	
	System.out.println("Enter Marks of Marathi");
	float Marathi=sc.nextFloat();
	
	System.out.println("Enter the marks of Geography");
	float Geography=sc.nextFloat();
	
	
	float total=Science+English+Maths+Marathi+Geography;
	
	float p=total/500*100;
	
	
	System.out.println("Name of Student is : "+Name);
	System.out.println("Rollno of Student is : "+Roll);
	System.out.println("Percentage : "+p+"%");
	
	
}
}



//Write a program in Java, using the Scanner methods, to read and display the following details:
//
//Name - as a String data type
//Roll Number - as an integer data type
//Marks in 5 subjects - as a float data type
//
//Compute and display the percentage of marks