package bakjoon;

import java.util.Arrays;
import java.util.Scanner;

public class 백준11047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner= new Scanner(System.in);
		scanner = new Scanner(aa);
		
		int n = scanner.nextInt();
		int total = scanner.nextInt();
		
		int[] coins = new int[n];
		 
		
		for(int i = 0; i < n; i++) {
			coins[i] =scanner.nextInt();
		}
		
	 
		int count = 0;
		for(int i = n-1; i >= 0; i--) {
			if(coins[i] <= total) {
				int a = total/coins[i];
				count += a;
				total = total - a*coins[i]; 
			}
			 
		}
		System.out.println(count);
	}

 
 

	static String aa = "10 4790\r\n" + 
			"1\r\n" + 
			"5\r\n" + 
			"10\r\n" + 
			"50\r\n" + 
			"100\r\n" + 
			"500\r\n" + 
			"1000\r\n" + 
			"5000\r\n" + 
			"10000\r\n" + 
			"50000";
}
