package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 백준10815 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());

		PriorityQueue<Integer> cards = new PriorityQueue<Integer>();

		st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < n; i++) {
			cards.add(Integer.parseInt(st.nextToken()));
		}
		st = new StringTokenizer(bf.readLine());
		int m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(bf.readLine());

		 
		System.out.println(cards.toString());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			int t = Integer.parseInt(st.nextToken());

			if (cards.peek() > t) {
				sb.append(0 + " ");
			} else if (cards.contains(t)) {
				sb.append(1 + " ");
				for (int a : cards) {
					if (a == t) {
						cards.remove(a);
						break;
					}
				}
			} else {
				sb.append(0 + " ");
			}
		}
		System.out.println(sb.toString());

	}

	static String aa = "5\r\n" + "6 3 2 10 -10\r\n" + "8\r\n" + "10 9 -5 2 3 4 5 -10";

}
