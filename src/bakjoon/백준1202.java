package bakjoon;

import java.io.*;
import java.util.*;

public class 백준1202 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		int n = scanner.nextInt(); // 보석갯수
		int k = scanner.nextInt(); // 가방갯수

		Jewel[] jewels = new Jewel[n];
		for (int i = 0; i < n; i++) {
			jewels[i] = new Jewel(scanner.nextInt(), scanner.nextInt());
		}

		Arrays.sort(jewels, new Comparator<Jewel>() {

			@Override
			public int compare(Jewel o1, Jewel o2) {
				// TODO Auto-generated method stub

				if (o1.v > o2.v) {
					return -1;
				}
				return 0;
			}
		});

		System.out.println(Arrays.toString(jewels));

		ArrayList<Integer> bags = new ArrayList();
		for (int i = 0; i < k; i++) {
			bags.add(scanner.nextInt());
		}

		Collections.sort(bags);
		System.out.println(bags.toString());

		int sum = 0;
		int t = 0;
		for (int i = 0; i < n; i++) {
			t = 0;
			while (true) {
				if (bags.size() == 0 || t == bags.size()) {
					break;
				}
				if (bags.get(t) >= jewels[i].m) {
					sum += jewels[i].v;
					bags.remove(t);
					break;
				}

				t++;
			}
		}

		System.out.println(sum);

	}

	static class Jewel {
		int m, v;

		public Jewel(int m, int v) {
			super();
			this.m = m;
			this.v = v;
		}

		@Override
		public String toString() {
			return "m=" + m + ", v=" + v + "\n";
		}

	}

	static String aa = "4 4\r\n" + "\r\n" + "1 100\r\n" + "\r\n" + "2 200\r\n" + "\r\n" + "13 300\r\n" + "\r\n"
			+ "10 500\r\n" + "\r\n" + "10\r\n" + "\r\n" + "10\r\n" + "\r\n" + "10\r\n" + "\r\n" + "14";

}
