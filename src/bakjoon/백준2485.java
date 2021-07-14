package bakjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 백준2485 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		int n = scanner.nextInt();
		int[] arr = new int[n];
		arr[0] = scanner.nextInt();
		int[] gap = new int[n-1];
		for (int i = 1; i < n; i++) {
			arr[i] = scanner.nextInt();
			gap[i-1] = arr[i] - arr[i - 1] ; 
		}
 
		// 최대 공약수를 찾자
		//
		int min = Integer.MAX_VALUE;
 
		for (int i = 0; i < gap.length - 1; i++) {
			min = Math.min(min, GCD(gap[i], gap[i+1]));
		}  
		int count = 0;
		int t = 0;
		for(int i = arr[0]; i <= arr[arr.length-1]; i = i+min) {
			t++;
		}

		System.out.println(t-n );
	}

	static int GCD(int a, int b) { // 최대 공약수
		if (a % b == 0) {
			return b;
		}
		return GCD(b, a % b);
	}

	static String aa = "4\r\n"
			+ "2\r\n"
			+ "6\r\n"
			+ "12\r\n"
			+ "18";
}
