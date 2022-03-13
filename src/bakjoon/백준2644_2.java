package bakjoon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 백준2644_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 0711 0734
//		Scanner scanner = new Scanner(System.in);
		Scanner scanner = new Scanner(aa);

		int n = scanner.nextInt();// 총 사람
		int a = scanner.nextInt();// 관계를 찾아야하는 1
		int b = scanner.nextInt();// 관계를 찾아야하는 2
		int m = scanner.nextInt();// 간선수
		int[][] cousin = new int[n + 1][n + 1];
		for (int i = 0; i < m; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			cousin[x][y] = 1;
			cousin[y][x] = 1;

		}

		boolean[] visited = new boolean[n + 1];

		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(Math.min(a, b));

		int count = 0;

		while (!queue.isEmpty()) {

			int qSize = queue.size();
			
			while (qSize != 0) {
				int temp = queue.poll();
				if (temp == Math.max(a, b)) {
					System.out.println(count);
					return;
				}
				for (int i = 1; i <= n; i++) {

					if (!visited[i] && cousin[temp][i] == 1) { 
						queue.add(i);

						visited[i] = true;
					}
				}
				qSize--;
			}
			count++;

		}

		System.out.println(-1);
	}

	static String aa = "9\r\n"
			+ "8 6\r\n"
			+ "7\r\n"
			+ "1 2\r\n"
			+ "1 3\r\n"
			+ "2 7\r\n"
			+ "2 8\r\n"
			+ "2 9\r\n"
			+ "4 5\r\n"
			+ "4 6";
}
