package bakjoon;

import java.util.*;

public class 백준1260 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		n = scanner.nextInt();
		int m = scanner.nextInt();
		int v = scanner.nextInt();
		list = new ArrayList[n + 1];
		for (int i = 0; i < n + 1; i++) {
			list[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < m; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			list[x].add(y);
			list[y].add(x);
		}
		for (int i = 0; i < n + 1; i++) {
			Collections.sort(list[i]);
		}
		visited = new boolean[n + 1];
		dfs(v);
		System.out.println();
		bfs(v);
	}

	static int n;
	static ArrayList<Integer>[] list;
	static boolean[] visited;

	static public void dfs(int start) {
		// 재귀
		visited[start] = true;
		System.out.print(start + " ");
		for (int i = 0; i < list[start].size(); i++) {
			if (!visited[list[start].get(i)]) {
				visited[list[start].get(i)] = true;

				dfs(list[start].get(i));
			}
		}
	}

	static public void bfs(int start) {
		// queue

		Queue<Integer> queue = new LinkedList();
		queue.offer(start);
		visited = new boolean[n + 1];
		visited[start] = true;

		while (!queue.isEmpty()) {
			int temp = queue.poll();
			System.out.print(temp + " ");
			for (int i = 0; i < list[temp].size(); i++) {
				if (!visited[list[temp].get(i)]) {
					visited[list[temp].get(i)] = true;

					queue.offer(list[temp].get(i));
				}
			}
		}

	}

	static String aa = "5 5 3\r\n"
			+ "5 4\r\n"
			+ "5 2\r\n"
			+ "1 2\r\n"
			+ "3 4\r\n"
			+ "3 1";


}
