package bakjoon;

import java.util.Arrays;
import java.util.Scanner;

public class 백준2512 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		int n = scanner.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int max = scanner.nextInt();
		long result = 0;
		Arrays.sort(arr); 
		long left = 0;
		long right = arr[n-1];
		while(left <= right) {
			long mid = (left+right)/2;
			long sum = 0;
			for(int money : arr) {
				if(money >= mid) {
					sum += mid;
				}else {
					sum += money;
				}
			}
			if(sum > max) {
				right = mid -1;
			}else {
				left = mid+1;
				result = Math.max(result, mid);
			}
		}
		System.out.println(result);
		
	}
 
	static String aa = "5\r\n"
			+ "70 80 30 40 100\r\n"
			+ "450";

}
