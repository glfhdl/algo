package bakjoon;

import java.util.Arrays;
import java.util.Scanner;

public class 백준1826 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);
		
		int n = scanner.nextInt();
		Info[] arr = new Info[n]; 
		Info first = new Info(scanner.nextInt(), scanner.nextInt());

		for(int i = 0; i < n; i++) { 
			arr[i] =new Info(scanner.nextInt(), scanner.nextInt());
		}

		Arrays.sort(arr); 
		 
	}

	static class Info{
		int d;
		int f;
		public Info(int d, int f) {
			super();
			this.d = d;
			this.f = f;
		}
		
		
	}
	
	static String aa = "4\r\n"
			+ "4 4\r\n"
			+ "5 2\r\n"
			+ "11 5\r\n"
			+ "15 10\r\n"
			+ "25 10";

}
