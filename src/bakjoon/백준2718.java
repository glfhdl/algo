package bakjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 백준2718 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		scanner = new Scanner(aa);
		n = scanner.nextInt();
		m = scanner.nextInt();

		map = new int[n][m];

		for (int i = 0; i < n; i++) {
			String temp = scanner.next();
			for (int j = 0; j < m; j++) {
				map[i][j] = temp.charAt(j) - '0';
			}
		}

		visited = new boolean[n][m];
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (map[i][j] == 1 && !visited[i][j]) {
					visited[i][j] = true;
					Queue<XY> queue = new LinkedList<XY>();
					queue.offer(new XY(i, j));

					while (!queue.isEmpty()) {
						int qs = queue.size();
						while (true) {
							if (qs == 0)
								break;

							XY temp = queue.poll();
							if (temp.x == map.length - 1 && temp.y == map[0].length - 1) {
								count++;
								System.out.println(count);
								return;
							}

							for (int n = 0; n < 4; n++) {
								int moveX = temp.x + dx[n];
								int moveY = temp.y + dy[n];

								if (isIn(moveX, moveY) && !visited[moveX][moveY] && map[moveX][moveY] == 1) {

									visited[moveX][moveY] = true;

									queue.offer(new XY(moveX, moveY));
								}

							}
							qs--;
						}
						count++;
					}
				}
				System.out.println(count);
				return;
			}
		}
	}

	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };

	static class XY {
		int x;
		int y;

		public XY(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

	}

	static boolean isIn(int x, int y) {
		return x >= 0 && y >= 0 && x < n && y < m ? true : false;
	}

	static boolean[][] visited;
	static int n;
	static int m;
	static int[][] map;

	static String aa = "4 6\r\n" + "101111\r\n" + "101010\r\n" + "101011\r\n" + "111011";
}
