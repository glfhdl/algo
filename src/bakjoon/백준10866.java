package bakjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class 백준10866 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		int n = scanner.nextInt();

		ArrayList<Integer> array = new ArrayList();

		for (int i = 0; i < n; i++) {
			String order = scanner.next();

			if (order.equals("push_front")) { 
				array.add(0, scanner.nextInt());

			} else if (order.equals("push_back")) { 
				array.add(scanner.nextInt());

			} else if (order.equals("pop_front")) {
				if (array.isEmpty()) {
					System.out.println("-1" );
				} else {

					System.out.println(array.get(0));
					array.remove(0);
				}
			} else if (order.equals("pop_back")) {
				if (array.isEmpty())
					System.out.println("-1" );
				else {

					System.out.println(array.get(array.size() - 1));
					array.remove(array.size() - 1);
				}
			} else if (order.equals("size")) {
				System.out.println(array.size());
			} else if (order.equals("empty")) {
				if (array.isEmpty())
					System.out.println(1);
				else {
					System.out.println(0);
				}

			} else if (order.equals("front")) {
				if (array.isEmpty())
					System.out.println("-1" );
				else {
					System.out.println(array.get(0));
				}

			} else if (order.equals("back")) {
				if (array.isEmpty())
					System.out.println("-1" );
				else {
					System.out.println(array.get(array.size() - 1));
				}
			}
		}

	}

	static String aa ="22\r\n" + 
			"front\r\n" + 
			"back\r\n" + 
			"pop_front\r\n" + 
			"pop_back\r\n" + 
			"push_front 1\r\n" + 
			"front\r\n" + 
			"pop_back\r\n" + 
			"push_back 2\r\n" + 
			"back\r\n" + 
			"pop_front\r\n" + 
			"push_front 10\r\n" + 
			"push_front 333\r\n" + 
			"front\r\n" + 
			"back\r\n" + 
			"pop_back\r\n" + 
			"pop_back\r\n" + 
			"push_back 20\r\n" + 
			"push_back 1234\r\n" + 
			"front\r\n" + 
			"back\r\n" + 
			"pop_back\r\n" + 
			"pop_back";

}
