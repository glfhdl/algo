package bakjoon;

import java.util.Arrays;
import java.util.Scanner;

public class 백준2805 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		Arrays.sort(arr);
		int left = 1;
		int right = arr[n - 1]; 
		int mid = 0; 
		while (left <= right) {
 
			mid = (left + right) / 2;

			int temp = 0;
			for (int i = n - 1; i >= 0; i--) {
				if (arr[i] > mid) {
					temp += arr[i] - mid;
				} else {
					// left = arr[i];
					break;
				}

			}

			if (temp >= m) {

				left = mid + 1;
			} else   {
				right = mid - 1;

			}

		}
		System.out.println(right);
	}

	static String aa = "5 20\r\n" + "4 42 40 26 46";

}
