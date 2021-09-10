package bakjoon;

import java.io.*;
import java.util.*;

public class 백준10989 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}
		
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for(int a : arr)
			sb.append(a + "\n");
			
		System.out.println(sb.toString());
		
	}

}
