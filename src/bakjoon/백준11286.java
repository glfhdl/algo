package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 백준11286 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int n = Integer.parseInt(st.nextToken());

		PriorityQueue<Integer> array = new PriorityQueue<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if (Math.abs( o1) > Math.abs( o2))
					return 1;
				else if (Math.abs(o1) == Math.abs( o2)) {
					if ( o1 >  o2) {
						return 2;
					}
				} 
					
				return -1;
			}
		});
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(bf.readLine());
			int t = Integer.parseInt(st.nextToken());
			if (t != 0) {
				array.offer(t);
			} else { 
				if (array.size() == 0) {
					sb.append(0 + "\n");
				} else {

					sb.append(array.poll() + "\n");  

				}
			}

		}
		System.out.println(sb.toString());
	}
	

	static String aa = "18\r\n" + "1\r\n" + "-1\r\n" + "0\r\n" + "0\r\n" + "0\r\n" + "1\r\n" + "1\r\n" + "-1\r\n"
			+ "-1\r\n" + "2\r\n" + "-2\r\n" + "0\r\n" + "0\r\n" + "0\r\n" + "0\r\n" + "0\r\n" + "0\r\n" + "0";

}
