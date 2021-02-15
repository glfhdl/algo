package bakjoon;

import java.util.Scanner;

public class 백준1978_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 0;

		for (int i = 0; i < n; i++) {
			int t = scanner.nextInt();
			if (t != 1) {
				if (isPrime(t)) {
					count++;
				}
			}
		}

		System.out.println(count);

	}

	static boolean isPrime(int x) {

		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				return false;

			}
		}

		return true;
	}

}
