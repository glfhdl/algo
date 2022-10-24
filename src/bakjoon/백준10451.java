package bakjoon;

import java.util.*;
import java.util.Queue;
import java.util.Scanner;

public class 백준10451 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		int tc = scanner.nextInt();
		for (int i = 0; i < tc; i++) {
			int n = scanner.nextInt();
			int[] arr = new int[n + 1];
			boolean[] check = new boolean[n + 1];
			for (int j = 1; j <= n; j++) {
				arr[j] = scanner.nextInt();
			}
			int count = 0;
			Queue<Integer> queue = new LinkedList();
			for (int j = 1; j <= n; j++) {

				if (!check[j]) {
					count++;
					queue.offer(arr[j]);
					check[j] = true;
					while (!queue.isEmpty()) {
						int tt = queue.poll();
						if (!check[tt]) {
							check[tt] = true;
							queue.offer(arr[tt]);
						}
					}
				}
				//System.out.println(Arrays.toString(check));
			}
			System.out.println(count);
		}

	}

	static String aa = "2\r\n" + "8\r\n" + "3 2 7 8 1 4 5 6\r\n" + "10\r\n" + "2 1 3 4 5 6 7 9 10 8";

}
