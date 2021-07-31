package bakjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import bakjoon.백준2583.xy;

public class 백준7576 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		m = scanner.nextInt();
		n = scanner.nextInt();

		map = new int[n][m];
		rottens = new ArrayList<xy>();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int t = scanner.nextInt();
				map[i][j] = t;
				if (t == 1) {
					rottens.add(new xy(i, j));
				}
			}
		}

		count = 0;

		bfs();
		if (!isRotten()) {
			System.out.println(-1);
		} else {
			System.out.println(count-1);
		}

	}

	static void bfs() {
		int[] dx = { 0, 1, 0, -1 };
		int[] dy = { 1, 0, -1, 0 };

		boolean[][] visited = new boolean[n][m];
		Queue<xy> queue = new LinkedList<xy>();

		for (xy a : rottens) {
			queue.add(a);
			visited[a.x][a.y] = true;
		}
 
		while (!queue.isEmpty()) {
			int qSize = queue.size();
			while (true) {
				if (qSize == 0)
					break;

				xy temp = queue.poll(); 
				for (int t = 0; t < 4; t++) {

					int moveX = temp.x + dx[t];
					int moveY = temp.y + dy[t];
					if (isIn(moveX, moveY) && !visited[moveX][moveY] && map[moveX][moveY] == 0) {
						queue.offer(new xy(moveX, moveY)); 
						visited[moveX][moveY] = true;
						map[moveX][moveY] = 1;
					}

				}
				qSize--;
			}
			if((!queue.isEmpty()))
			count++;
		}

	}

	static boolean isRotten() { 
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (map[i][j] == 0) { 
					return false;
				}
			}
		}

		return true;

	}

	static int n, m;
	static int count;
	static int[][] map;
	static ArrayList<xy> rottens;

	static boolean isIn(int x, int y) {
		return x >= 0 && y >= 0 && x < n && y < m ? true : false;
	}

	static class xy {
		int x;
		int y;

		public xy(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return "xy [x=" + x + ", y=" + y + "]";
		}

	}

	static String aa = "2 2\r\n"
			+ "1 -1\r\n"
			+ "-1 1";
}
