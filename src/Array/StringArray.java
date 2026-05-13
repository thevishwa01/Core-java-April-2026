package Array;

public class StringArray {
	public static void main(String[] args) {

		String[] Days = { "Mondya", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

		for (int i = 0; i < Days.length; i++) {

			if (Days[i].startsWith("S")) {
				System.out.println(Days[i]);

			}

		}

	}
}
