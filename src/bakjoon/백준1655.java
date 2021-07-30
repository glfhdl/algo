package bakjoon;

import java.util.Collections;
import java.util.PriorityQueue;
import java.io.BufferedReader;
import java.io.*;
import java.util.*;

public class 백준1655 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	 
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(bf.readLine());
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(bf.readLine()));
			Collections.sort(list);
			int t = list.size() / 2;
			if (list.size() % 2 == 1) {
				sb.append(list.get(t) + "\n");
			} else {
				sb.append(Math.min(list.get(t), list.get(t - 1)) + "\n");
			}

		}
		System.out.println(sb.toString());
	}

	static String aa = "7\r\n" + "1\r\n" + "5\r\n" + "2\r\n" + "10\r\n" + "-99\r\n" + "7\r\n" + "5";
}
