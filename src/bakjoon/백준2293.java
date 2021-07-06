package bakjoon;

import java.util.*;

public class 백준2293 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		int n = scanner.nextInt();
		k = scanner.nextInt();
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		count = 0;
		cal(0);
		System.out.println(count);
	}

	static int count;
	static int k;
	static int[] arr;

	public static void cal(int sum) {
		if (k == sum) {
			System.out.println(" / 도는중1 " + sum);
			count++;
			return;
		} else if (k < sum) {
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			
			sum += arr[i];
			System.out.print(arr[i] + "/" + sum + " ");
			if (k >= sum) {
				cal(sum);
			}
				
		}
	}

	static String aa = "3 10\r\n" + "1\r\n" + "2\r\n" + "5";
}
