package If_Assigment;

public class ExamPassFail {
public static void main(String[] args) {
	int Maths=40;
	int English=40;
	int Science=30;
	
	if (Maths<=33) {
		System.out.println("The Student is Fail");
	if (English<=33) {
		System.out.println("The Student is failed");
	if (Science<=33) {
		System.out.println("The student is Failed ");		
	}
	}
	}
	else {
		System.out.println("The student is Passed");
	}
}
}

//Exam Pass/Fail
//Input marks in 3 subjects.
//If any subject is below 33, print "Fail", else print "Pass".