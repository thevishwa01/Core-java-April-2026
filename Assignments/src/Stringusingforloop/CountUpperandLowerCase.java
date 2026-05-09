package Stringusingforloop;

public class CountUpperandLowerCase {
	public static void main(String[] args) {

		String s = "VishWanTH";
		int Count = 0;
		int Lcount = 0;

		int count=0;
		int lcount=0;
		
		for (int i = 0; i < s.length(); i++) {

			char cht = s.charAt(i);

			if (cht >= 'A' && cht <= 'Z') {
				Count++;
			} else {
				if (cht >= 'a' && cht <= 'z') {
					Lcount++;
				}
			}
			
		// =========== Used Method =====================

			if (Character.isUpperCase(cht)) {
				count++;
			} else {
				if (Character.isLowerCase(cht)) {
					lcount++;
				}
			}

		}
		System.out.println("The Upper Case are " + Count);
		System.out.println("The Lower Case are " + Lcount);

		System.out.println("=========Output of using Method===========");

		System.out.println("The Uspper Case are using method "+count);
		System.out.println("The Uspper Case are using method "+lcount);

	}

}
