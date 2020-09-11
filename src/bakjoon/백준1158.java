package bakjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 백준1158 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int[] result = new int[n];
		int[] tt = new int[n];
		Queue<Integer> queue = new LinkedList<Integer>();

		for (int i = 1; i <= n; i++) {
			queue.offer(i);
			tt[i - 1] = i;
		}

		int idx = 0;
		boolean[] visited = new boolean[n + 1];
		int i = 1;
		int t = 0;
		while (true) {

			if (idx == n)
				break;

			if (!visited[i % n] && i % k == 0) {
				System.out.println(i % n + "...");
				idx++;
				visited[i % n] = true;
				i++;
			} else {
				i++;
				if(visited[i % n])
					i++;
			}
			System.out.println(i);
			if (i > 30)
				break;
		}

	}

	static String aa = "7 3";
}
