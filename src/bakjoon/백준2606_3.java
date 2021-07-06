package bakjoon;

import java.util.*;

public class 백준2606_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		int edge = scanner.nextInt();
		int line = scanner.nextInt();

		map = new ArrayList[edge + 1];

		for (int i = 0; i < edge + 1; i++) {
			map[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < line; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();

			map[a].add(b);
			map[b].add(a);
		}
		count = 0;
		visited = new boolean[edge + 1];
		dfs(1);
		System.out.println(count);
	}

	static int count;
	static boolean[] visited;
	static ArrayList<Integer>[] map;

	public static void dfs(int start) {
		visited[start] = true;

		for (int i = 0; i < map[start].size(); i++) {
			int t = map[start].get(i);

			if (!visited[t]) {
				visited[t] = true;
				count++;
				dfs(t);
			}
		}
	}

	static String aa = "7\r\n" + 
			"6\r\n" + 
			"1 2\r\n" + 
			"2 3\r\n" + 
			"1 5\r\n" + 
			"5 2\r\n" + 
			"5 6\r\n" + 
			"4 7";



}
