package bakjoon;

import java.util.Arrays;
import java.util.Scanner;

public class 백준1149 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		int n = scanner.nextInt();
		int[][] map = new int[n][3];
		int[][] dp = new int[n][3];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				map[i][j] = scanner.nextInt();

			}
		}

		int result = 0;
		dp[0][0] = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < 3; j++) {
				if (i == 0)
					dp[i][j] = map[i][j];
				else {
					if (j == 0) {
						dp[i][j] +=   map[i][0] + Math.min(dp[i-1][1], dp[i-1][2]);
					} else if (j == 1) {
						dp[i][j] +=  map[i][1] +  Math.min(dp[i-1][0], dp[i-1][2]);
					} else if (j == 2) {
						dp[i][j] +=  map[i][2] +  Math.min(dp[i-1][0], dp[i-1][1]);
					}
				}

			}

		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(dp[i][j] + " ");

			}
			System.out.println();
		}
		result = Math.min(dp[n - 1][0], dp[n - 1][1]);
		result = Math.min(result, dp[n - 1][2]);

		System.out.println(result);
	}

	static String aa = "3\r\n" + "1 2 3\r\n" + "1 2 3\r\n" + "111 1 111";

}
