package bakjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 백준2110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		int n = scanner.nextInt();
		m = scanner.nextInt();

		homes = new int[n];
		int[] order = new int[n - 2];
		routers = new int[m];

		for (int i = 0; i < n; i++) {
			homes[i] = scanner.nextInt();
			if (i < n - 2)
				order[i] = i + 1;
		}
		for (int i = 0; i < m; i++) {
			routers[i] = i;
		}
		Arrays.sort(homes);
		routers[0] = homes[0];
		routers[m - 1] = homes[n - 1];
		
		max = Integer.MIN_VALUE;

		comi(order, m - 2, 0, new int[n]);
		
		System.out.println(max);

	}

	static int m;
	static int[] routers;
	static int[] homes;

	static void comi(int[] src, int r, int i, int[] temp) {
		if (r == 0) {
			int k = 1;
			for (int j = src.length - 2; j >= src.length - (m - 2) - 1; j--) {
				routers[k] = homes[temp[j]];
				k++;
			} 
			cal();
			return;
		} else if (i == src.length) {
			return;
		} else {
			temp[src.length - 1 - r] = src[i];
			comi(src, r - 1, i + 1, temp);
			comi(src, r, i + 1, temp);
		}
	}
	
	static int max;
	
	static void cal() {
		int  min  = Integer.MAX_VALUE;
		for(int i = 1; i < m; i++) {
			min = Math.min(min, routers[i]-routers[i-1]);
		}
		
		max = Math.max(max, min);
	}

	static String aa = "5 3\r\n" + "1\r\n" + "2\r\n" + "8\r\n" + "4\r\n" + "9";

}
