package bakjoon;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class 백준1003 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) { 
			zero = 0;
			one = 0;
			fibo( Integer.parseInt(bf.readLine()));
			sb.append(zero + " " + one + "\n");
		}
		System.out.println(sb.toString());
 
	}

	static int zero;
	static int one;
	static public int fibo(int n) {
		if(n == 0) {
			zero++;
			return 0;
		}else if(n == 1) {
			one++;
			return 1;
		}else {
			return fibo(n-1) + fibo(n-2);
		}
		
	}
	static String aa = "3\r\n"
			+ "0\r\n"
			+ "1\r\n"
			+ "3";

}
