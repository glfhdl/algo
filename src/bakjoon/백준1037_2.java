package bakjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 백준1037_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner scanner = new Scanner(System.in);
	 

		int n = scanner.nextInt();
		if (n == 1) {
			int t = scanner.nextInt();
			System.out.println(t * t);
		} else {

			int[] a = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
			}Arrays.sort(a); 
			System.out.println(a[0] * a[a.length-1]);
		}

	}

	static String aa = "2\r\n" + "4 2";
	 
}
