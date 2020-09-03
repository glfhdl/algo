package bakjoon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 백준2609 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		HashMap<Integer, Integer> aList = factorization(a);
		HashMap<Integer, Integer> bList = factorization(b);

		int n = 2;
		int max = Math.max(a, b);

		int least = 1;
		int greatest = 1;
 
		while (true) {
			if (n == max) {
				break;
			}

			if (aList.containsKey(n) && bList.containsKey(n)) {
				least = (int) (least * Math.pow(n, Math.min(aList.get(n), bList.get(n))));
				greatest = (int) (greatest * Math.pow(n, Math.max(aList.get(n), bList.get(n))));

			}
			else if (aList.containsKey(n)) {
			 	greatest = (int) (greatest * Math.pow(n, aList.get(n)));
				
			}
			else if (bList.containsKey(n)) {
				greatest = (int) (greatest * Math.pow(n, bList.get(n)));
				
			}
			n++;
		}

		System.out.println(least);
		System.out.println(greatest);

	}

	static public HashMap factorization(int x) {

		HashMap<Integer, Integer> list = new HashMap<Integer, Integer>();

		int n = 2;
		while (true) {

			if (x / n == 0) {
				if (x != 1) {
					if (!list.containsKey(n)) {
						list.put(n, 1);
					} else {
						list.put(n, list.get(n) + 1);
					}
				}

				break;
			}

			if (x % n == 0) {
				x /= n;
				if (!list.containsKey(n))
					list.put(n, 1);
				else {
					list.put(n, list.get(n) + 1);
				}
			} else {
				n++;
			}

		}
 
		System.out.println(list.toString());
		return list;

	}

	static String aa = "6 3";
}
