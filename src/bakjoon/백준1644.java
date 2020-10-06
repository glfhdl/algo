package bakjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 백준1644 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		int n = scanner.nextInt();

		if (n == 1) {
			System.out.println(0);
		}
		if (n == 2 || n == 3) {
			System.out.println(1);
		} else {
			prime = new ArrayList<Integer>();
			prime.add(2);
			prime.add(3);
			takePrime(n);
			// System.out.println(prime.toString());

			int count = 0;
			for (int i = 0; i < prime.size(); i++) {
				int temp = 0;
				for (int j = i; j < prime.size(); j++) {
					temp += prime.get(j);
					if (temp == n)
						count++;
					if (temp > n)
						break;
				}
			}
			System.out.println(count);
		}

	}

	static ArrayList<Integer> prime;

	static void takePrime(int x) {
		for (int i = 5; i <= x; i += 2) {
			int t = 3;
			if (i % 2 != 0) {
				while (i > t) {
					if (i % t == 0) {
						break;
					} else {
						t++;
					}
				}
				if (t == i)
					prime.add(i);
			}
		}
	}

	static String aa = "53";
}
