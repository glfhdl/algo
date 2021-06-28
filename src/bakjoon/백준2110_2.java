package bakjoon;

import java.util.Arrays;
import java.util.Scanner;

public class 백준2110_2 {

	static int[] arr;
	static int n, s, cnt = 0;

	private static void dfs(int v, int sum) {
		if (v == n) {
			if (sum == s)
				cnt++;
			return;
		}

		dfs(v + 1, sum + arr[v]);
		dfs(v + 1, sum);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		s = scan.nextInt();
		arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = scan.nextInt();
		Arrays.sort(arr);

		dfs(0, 0);
		System.out.print(s == 0 ? --cnt : cnt);
	}

}
