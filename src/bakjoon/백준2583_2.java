package bakjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 백준2583_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		m = scanner.nextInt();
		n = scanner.nextInt();
		int k = scanner.nextInt();

		int[][] map = new int[n][m];

		for (int i = 0; i < k; i++) {
			int x1 = scanner.nextInt();
			int y1 = scanner.nextInt();
			int x2 = scanner.nextInt();
			int y2 = scanner.nextInt();

			for (int q = x1; q < x2; q++) {
				for (int w = m - y2; w < m - y1; w++) {
					map[q][w] = 1;
				}
			}
		}

		// 완탐 시작
		ArrayList<Integer> result = new ArrayList<Integer>();

		boolean[][] visited = new boolean[n][m];

		int[] dx = { 1, 0, -1, 0 };
		int[] dy = { 0, 1, 0, -1 };

		for (int a = 0; a < n; a++) {
			for (int b = 0; b < m; b++) {
				if (map[a][b] == 0 && !visited[a][b]) {
					Queue<XY> queue = new LinkedList<XY>();
					queue.add(new XY(a, b));
					visited[a][b] = true;
					int count = 0;
					while (!queue.isEmpty()) {
						XY temp = queue.poll();
						count++;
						for (int t = 0; t < 4; t++) {

							int moveX = temp.x + dx[t];
							int moveY = temp.y + dy[t]; 
							if (isIn(moveX, moveY)) {
								if (!visited[moveX][moveY]

										&& map[moveX][moveY] == 0) {
									queue.offer(new XY(moveX, moveY));
									visited[moveX][moveY] = true;
								}
							}
						}

					}
					result.add(count);
				}
			}

		}

		System.out.println(result.size());
		Collections.sort(result);
		for (int a : result)
			System.out.print(a + " ");

	}

	static int m;
	static int n;

	static boolean isIn(int x, int y) {
		return x >= 0 && y >= 0 && x < n && y < m ? true : false;
	}

	static class XY {
		int x;
		int y;

		public XY(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

	}

	static String aa = "5 7 3\r\n" + "0 2 4 4\r\n" + "1 1 2 5\r\n" + "4 0 6 2";

}
