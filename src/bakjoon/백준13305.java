package bakjoon;

import java.util.*;

public class 백준13305 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		int n = scanner.nextInt();
		int[] line = new int[n];
		int[] cost = new int[n + 1];
		for (int i = 0; i < n; i++) {
			line[i] = scanner.nextInt();

		}
		for (int i = 0; i < n + 1; i++) {
			cost[i] = scanner.nextInt();
		}

		int result = 0;

		// 다음 거리만큼은 최소로 가져가야한다.
		ArrayList<Integer> list = new ArrayList<Integer>();
		int temp = 0;
		int t = n;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < t; j++) {
				temp += line[j] * cost[i];
				if (j == n - 1) {
					list.add(temp);
				}
			}

		}

	}

	static String aa = "4\r\n" + "2 3 1\r\n" + "5 2 4 1";

}
