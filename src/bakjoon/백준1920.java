package bakjoon;

import java.util.Arrays;
import java.util.Scanner;

public class 백준1920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		int n = scanner.nextInt();
		arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		Arrays.sort(arr);
		int m = scanner.nextInt();
		sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			val = scanner.nextInt();
			binarySearch(0, n-1);
		} 

		System.out.println(sb.toString());
	}

	static int val;
	static int[] arr;
	static StringBuilder sb;

	static void binarySearch(int left, int right) {
		int mid = (left + right) / 2;

		if (left <= right) {
			if (arr[mid] == val) {
				sb.append("1\n");
				return;
			}else if(val < arr[mid]) {
				binarySearch(left, mid-1);
				return;
			}else {
				binarySearch(mid+1, right);
				return;
			}
		}
		
		sb.append("0\n");
		return;
		
	}

	static String aa = "5\r\n" + "4 1 5 2 3\r\n" + "5\r\n" + "1 3 7 9 5";

}
