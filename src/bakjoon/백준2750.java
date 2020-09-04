package bakjoon;

import java.util.Arrays;
import java.util.Scanner;

public class 백준2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);
		
		int n = scanner.nextInt();
		int[] array = new int[n];
		
		for(int i =0 ; i< n; i++) {
			array[i] = scanner.nextInt();
		}
		Arrays.sort(array);
		
		for(int i =0 ; i< n; i++) {
			System.out.println(array[i]);
		}

	}
	static String aa ="5\r\n" + 
			"5\r\n" + 
			"2\r\n" + 
			"3\r\n" + 
			"4\r\n" + 
			"1";
}
