package bakjoon;

import java.io.*;
import java.util.Scanner;
 

public class 백준15711 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for (int t = 0; t < n; t++) {
			String[] tt = bf.readLine().split(" ");
			long a = Long.parseLong(tt[0]);
			long b = Long.parseLong(tt[1]);

			long sum = a + b;

			boolean[] cache = new boolean[(int) (sum+1)];
			cache[0] = cache[1] = true;
			for (long i = 2; i * i <= sum; i++) { 
				for (long j = i*i;  j <= sum; j += i) {
					cache[(int) j] = true;
				}
			}
			
			boolean flag = false;
			for (long i = 2; i <= sum; i++) {
				if (!cache[(int) i] && !cache[(int) (sum-i)]) {
					sb.append("YES\n");
					flag = true;
					break;
				}
			}
			
			if(!flag)
				sb.append("NO\n"); 
		}
		// 위의 수를 다 빼라
		System.out.println(sb.toString());

	}

	static String aa = "2\r\n" + "3 4\r\n" + "3 5";

}
