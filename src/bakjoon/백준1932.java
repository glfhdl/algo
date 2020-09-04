package bakjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class 백준1932 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		int n = scanner.nextInt();

		ArrayList[] nums = new ArrayList[n];
		ArrayList[] dp = new ArrayList[n];

		for (int i = 0; i < n; i++) {
			nums[i] = new ArrayList<Integer>();
			dp[i] = new ArrayList<Integer>();
			for (int j = 0; j <= i; j++) {
				nums[i].add(scanner.nextInt());
			}
		}
		dp[0].add(nums[0].get(0));
		for (int i = 1; i < n; i++) {
			//System.out.println(nums[i].toString());
			for (int j = 0; j <= i; j++) {
				if (j - 1 >= 0 && j < i) {
					int a = (int) nums[i].get(j);
					int b = (int) dp[i - 1].get(j);
					int c = (int) dp[i - 1].get(j - 1);

					dp[i].add(a + Math.max(c, b));
				}

				if (j - 1 < 0) { 
					int a = (int) nums[i].get(j);
					int b = (int) dp[i - 1].get(j);
					dp[i].add(a + b);
				}

				if (j >= i) {
					int a = (int) nums[i].get(j);
					int b = (int) dp[i - 1].get(j-1);
					dp[i].add(a + b);
				}
			}
		} 
 
		int max = 0;
		for(int i = 0; i < dp[n-1].size(); i++) {
			int tt = (int)dp[n-1].get(i);
			max = Math.max(tt, max);
		}
		System.out.println(max);
		 
	}

	static String aa = "5\r\n" + "7\r\n" + "3 8\r\n" + "8 1 0\r\n" + "2 7 4 4\r\n" + "4 5 2 6 5";
}
