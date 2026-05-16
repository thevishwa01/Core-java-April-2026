package Array;

public class QUE14Test {
	public static void main(String[] args) {

		QUE41 q = new QUE41();
		q.name = "Vishwanath";

		QUE41 q1 = new QUE41();
		q1.name = "Prashant";

		QUE41 q2 = new QUE41();
		q2.name = "Rohit";

		QUE41 q3 = new QUE41();
		q3.name = "Rutwik";

		QUE41 q4 = new QUE41();
		q4.name = "Shubham";

		QUE41[] que = { q, q1, q2, q3, q4 };

		for (int i = 0; i < que.length; i++) {

			QUE41 Q = que[i];
			

			System.out.println(Q.name);
			System.out.println("");

		}

	}
}
