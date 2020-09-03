package bakjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class 백준1026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);
		
		int n = scanner.nextInt();
		Integer[] a = new Integer[n];
		Integer[] b = new Integer[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();  
		}
		for(int i = 0; i < n; i++) { 
			b[i] = scanner.nextInt();
			
		}
		
		Arrays.sort(a);
		Arrays.sort(b, Collections.reverseOrder());
	  
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += a[i] * b[i]; 
		} 
		System.out.println(sum);
		
	}
	static String aa = "5\r\n" + 
			"1 1 1 6 0\r\n" + 
			"2 7 8 3 1";

}
