package bakjoon;

import java.util.Arrays;
import java.util.Queue;

import java.util.*;

public class 백준1697 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		int n = scanner.nextInt();
		int k = scanner.nextInt();

		// 1초후
		// x--; x++; 2*x

		Queue<Integer> queue = new LinkedList();
		queue.offer(n);
		boolean[] visited = new boolean[100000*2 + 1];
		visited[n] = true;
		int time = 0;
		while (!queue.isEmpty()) {

			int qSize = queue.size();

			while (true) {
				if (qSize == 0) {
					break;
				}
				int temp = queue.poll();

				if (temp == k) {
					System.out.println(time);
					return;
				}

				if (temp +1 <= k && !visited[temp + 1]  ) {
					visited[temp + 1] = true;
					queue.offer(temp + 1);
				}
				if (temp -1 >= 0 && !visited[temp - 1]   ) {
					visited[temp - 1] = true;
					queue.offer(temp - 1);
				}
				if (temp <= k && !visited[temp * 2]  ) {
					visited[temp * 2] = true;
					queue.offer(temp * 2);
				}
				 
				qSize--;
			}

			time++;

		}

	}

	static String aa = "1 100000";

}
