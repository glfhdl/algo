package bakjoon;

import java.util.Collections;
import java.util.*;

public class 백준2751 {

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
		StringBuilder sb = new StringBuilder();
		for(int a : arr)
			sb.append(a + "\n");
		
		System.out.println(sb.toString());
	}

	
	static String aa = "5\r\n"
			+ "5\r\n"
			+ "4\r\n"
			+ "3\r\n"
			+ "2\r\n"
			+ "1";

}
