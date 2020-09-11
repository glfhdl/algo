package bakjoon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class 백준2606 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		int edge = scanner.nextInt();
		int line = scanner.nextInt();

		ArrayList<Integer> map[] = new ArrayList[edge + 1];
		boolean[] visited = new boolean[edge + 1];
		for (int i = 0; i < edge + 1; i++) {
			map[i] = new ArrayList();
		}

		for (int i = 0; i < line; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();

			map[a].add(b);
			map[b].add(a);
		}

		int count = 0;

		Queue<Integer> queue = new LinkedList();
		queue.offer(1);
		visited[1] = true;
		while (!queue.isEmpty()) {
			int temp = queue.poll();

			System.out.println("!" + temp);
			for (int i = 0; i < map[temp].size(); i++) {
				int t = map[temp].get(i);
				if (!visited[t]) {
					count++;
					queue.offer(t);
					visited[t] = true;
				}

			}

		}
		System.out.println(count);
	}

	static String aa = "6\r\n" + 
			"5\r\n" + 
			"3 4\r\n" + 
			"4 5\r\n" + 
			"5 6\r\n" + 
			"1 2\r\n" + 
			"2 3";

}
