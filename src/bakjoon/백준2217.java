package bakjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 백준2217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*			Scanner scan = new Scanner(System.in);scan = new Scanner(aa);
		int n = scan.nextInt(), w = 0;
		
		Integer[] weigh = new Integer[n];
		for(int i = 0; i < n; i++)
			weigh[i] = scan.nextInt();
		Arrays.sort(weigh, Collections.reverseOrder());
		
		for(int k = 1; k <= n; k++)
			 w = Math.max(w, weigh[k-1]*k);
		System.out.println(w);*/
		
	Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		int n = scanner.nextInt();

		int[] ropes = new int[n];
		max = 0;
		for (int i = 0; i < n; i++) {
			ropes[i] = scanner.nextInt();
		}

		bit(ropes, n);
		System.out.println(max);
		
	}

	static int max;

	static void bit(int[] arr, int n) {
		for (int i = 0; i < 1 << n; i++) {

			int idx = 0;
			int min = Integer.MAX_VALUE;
			for (int j = 0; j < n; j++) {
				if ((i & 1 << j) != 0) {
					idx++;
					min = Math.min(min, arr[j]);

				}

			}
			if (idx != 0)
				max = Math.max(max, min * idx);
		}
	}

	static String aa = "3\r\n" + 
			"9 8 1";

}
