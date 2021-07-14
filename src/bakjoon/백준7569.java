package bakjoon;

import java.util.*;
import java.util.Scanner;

public class 백준7569 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		x = scanner.nextInt();
		yy = scanner.nextInt();
		h = scanner.nextInt();

		map = new int[yy * h][x];

		boolean flag = false;
		for (int i = 0; i < yy * h; i++) {
			for (int j = 0; j < x; j++) {
				map[i][j] = scanner.nextInt();
				if (map[i][j] == 0)
					flag = true;
			}
		}

		if (!flag) {
			System.out.println(0);
		} else {

			count = 0;
			visited = new boolean[yy * h][x];
			for (int i = 0; i < yy * h; i++) {
				for (int j = 0; j < x; j++) {
					if (map[i][j] == 1) {
						bfs(i, j);
					}
				}
			}
 
			boolean flag1 = false;
			for (int i = 0; i < yy * h; i++) {
				for (int j = 0; j < x; j++) {
					if (map[i][j] == 0) {
						System.out.println(-1);
						return;
					}
				}
			}

			System.out.println(count);

		}
	}

	static void bfs(int y, int x) {

		int[] dx = { 1, 0, -1, 0, 0, 0 };
		int[] dy = { 0, 1, 0, -1, yy, -yy };

		visited[x][y] = true;
		Queue<XY> queue = new LinkedList<XY>();
		queue.offer(new XY(y, x));

		while (!queue.isEmpty()) {
			int qSize = queue.size();
			while (true) {
				if (qSize == 0)
					break;

				XY temp = queue.poll();

				for (int i = 0; i < 6; i++) {
					 System.out.println(temp.toString());
					int moveY = dy[i] + temp.y;
					int moveX = dx[i] + temp.x;

					if (isIn(moveX, moveY) && map[moveX][moveY] == 0 && !visited[moveX][moveY]) {
						 System.out.println(i + " " +moveX + " " + moveY);
						map[moveX][moveY] = 1;
						visited[moveX][moveY] = true;
						queue.offer(new XY(moveX, moveY));

					}
				}
				qSize--;
			}

			System.out.println();
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[0].length; j++) {
					System.out.print(map[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();

			if (!queue.isEmpty())
				count++;
		}

	}

	static class XY {
		int x;
		int y;

		public XY(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return "XY [x=" + x + ", y=" + y + "]";
		}

	}

	static boolean isIn(int b, int a) {
		return a >= 0 && b >= 0 && a < x && b < yy * h ? true : false;
	}

	static boolean[][] visited;
	static int x, yy, h, count;
	static int[][] map;
	static String aa = "5 3 2\r\n"
			+ "0 0 0 0 0\r\n"
			+ "0 0 0 0 0\r\n"
			+ "0 0 0 0 0\r\n"
			+ "0 0 0 0 0\r\n"
			+ "0 0 1 0 0\r\n"
			+ "0 0 0 0 0";
	
	
	
}
