package bakjoon;

import java.util.Arrays;
import java.util.Scanner;

public class 백준1929 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		int n = scanner.nextInt();
		int m = scanner.nextInt();

		boolean[] arr = new boolean[m + 1];
		arr[0] = arr[1] = true; 

		for (int i = 2; (i * i) <= m; i++) {
			for (int j = i * i; j <= m; j += i) {
				arr[j] = true;
			}  
		}

		StringBuilder sb = new StringBuilder();
		for (int i = n; i <= m; i++) {
			if(!arr[i]) {
				sb.append(i + "\n"); 
			}
		}
		System.out.println(sb.toString());
	}

	static String aa = "3 16";

}
