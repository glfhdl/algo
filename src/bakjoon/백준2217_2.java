package bakjoon;

import java.util.Arrays;
import java.util.Scanner;

public class 백준2217_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);
		int n = scanner.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		Arrays.sort(arr);
		 
		
		System.out.println(arr[0]*n);

	}

	static String aa = "2\r\n" + 
			"10\r\n" + 
			"15";
}
