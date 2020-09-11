package bakjoon;

import java.util.PriorityQueue;
import java.util.Scanner;

public class 백준1182 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		int n = scanner.nextInt();
		m = scanner.nextInt();

		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = scanner.nextInt();
		}
		count = 0;
		bit(nums, n);
		System.out.println(count);
	}

	static int count;
	static int m;

	static void bit(int[] arr, int n) {
		for (int i = 0; i < 1 << n; i++) {
			int sum = 0;
			boolean flag = false;
			for (int j = 0; j < n; j++) {
				if ((i & 1 << j) != 0) {
					sum += arr[j];  
					flag = true;
				}

			}  
			if (m == sum && flag)
				count++;

		}
	}

	static String aa = "5 0\r\n" + "-7 -3 -2 5 8";

}
