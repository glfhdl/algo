package bakjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 백준2750_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);
		
		int n = scanner.nextInt();
		
		int[] a = new int[n]; 
		 
			for(int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
			} 
			
			Arrays.sort(a); 
			 
			for(int sum : a)
				System.out.println(sum);
		 
	}

	static String aa = "5\r\n" + 
			"5\r\n" + 
			"2\r\n" + 
			"3\r\n" + 
			"4\r\n" + 
			"1";
}
