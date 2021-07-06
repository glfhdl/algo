package bakjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 백준2217_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		int n = scanner.nextInt();
		Integer[] arr = new Integer[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		Arrays.sort(arr, Collections.reverseOrder());
		
		int max = Integer.MIN_VALUE;
		 
		for(int i = 0; i < n; i++) { 
			if( max < (arr[i]*(i+1))) {
				max = arr[i]*(i+1);
			}
		}
		
		System.out.println(max);
	}
	
	static String aa = "2\r\n"
			+ "10\r\n"
			+ "15";
	

}
