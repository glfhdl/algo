package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class 백준11047_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] aa = bf.readLine().split(" ");
		int n = Integer.parseInt(aa[0]);
		int money = Integer.parseInt(aa[1]);
		
		int[] list = new int[n];
		for(int i = 0; i < n; i++) {
			list[i]  = Integer.parseInt(bf.readLine());
		}
		Arrays.sort(list);
		 
		int count = 0;
		
		for(int i = n-1; i >= 0; i--) {
			if(money / list[i] > 0 && money >= list[i]) {
				int quota =  money / list[i];
				count += quota;
				money -= list[i]*quota; 
			}
		}
		
		System.out.println(count);
	}

}
