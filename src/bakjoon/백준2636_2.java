package bakjoon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 백준2636_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		x = scanner.nextInt();
		y = scanner.nextInt();

		map = new int[x][y];

		int count1 = 0;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				int t = scanner.nextInt();
				map[i][j] = t;
				if (t == 1)
					count1++;

			}
		}

		// 치즈가 없을때까지 탐색
		int time = 0;
		count = new ArrayList<Integer>();
		count.add(count1);
		while (true) {
			if (count.get(count.size() - 1) == 0) {

				break;
			}
			air(map);
			time++;
			

		}

		System.out.println(time-1);
		System.out.println(count.get(count.size()-2));
 

	}

	static int x;
	static int y;
	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };
	static ArrayList<Integer> count;
	static int[][] map;

	// 공기구멍 찾기
	static void air(int[][] map) {

		int[][] test = new int[x][y];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				test[i][j] = map[i][j];
			}
		}
		Queue<XY> queue = new LinkedList<XY>();
		queue.offer(new XY(0, 0));
		boolean[][] visited = new boolean[x][y];
		visited[0][0] = true;
		test[0][0] = -1;
		while (!queue.isEmpty()) {
			XY temp = queue.poll();

			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					int moveX = temp.x + dx[i];
					int moveY = temp.y + dy[i];

					if (isIn(moveX, moveY) && !visited[moveX][moveY] && test[moveX][moveY] == 0) {
						queue.offer(new XY(moveX, moveY));
						visited[moveX][moveY] = true;
						test[moveX][moveY] = -1;
					}
				}
			}

		}
		 
		cheese(test);

		// 치즈 갯수 세기
	}

	static void cheese(int[][] air) {

		int[][] test = new int[x][y];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				test[i][j] = air[i][j];
			}
		}

		int ct = 0;
		// 치즈 찾기
		for (int n = 0; n < x; n++) {
			for (int m = 0; m < y; m++) {
				if (test[n][m] == 1) {
					ct++;
					for (int i = 0; i < 4; i++) {
						for (int j = 0; j < 4; j++) {
							int moveX = n + dx[i];
							int moveY = m + dy[i];

							if (isIn(moveX, moveY) && test[moveX][moveY] == -1) {
								// 공기와 맞닿아있으니까 제거
								map[n][m] = 0;
							}
						}
					}

				}
			}
		}

		count.add(ct);

		// 치즈 갯수 세기
	}

	static boolean isIn(int a, int b) {
		return a >= 0 && b >= 0 && a < x && b < y ? true : false;
	}

	static class XY {

		int x;
		int y;

		@Override
		public String toString() {
			return "XY [x=" + x + ", y=" + y + "]";
		}

		public XY(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

	}

	static String aa = "13 12\r\n" + "0 0 0 0 0 0 0 0 0 0 0 0\r\n" + "0 0 0 0 0 0 0 0 0 0 0 0\r\n"
			+ "0 0 0 0 0 0 0 1 1 0 0 0\r\n" + "0 1 1 1 0 0 0 1 1 0 0 0\r\n" + "0 1 1 1 1 1 1 0 0 0 0 0\r\n"
			+ "0 1 1 1 1 1 0 1 1 0 0 0\r\n" + "0 1 1 1 1 0 0 1 1 0 0 0\r\n" + "0 0 1 1 0 0 0 1 1 0 0 0\r\n"
			+ "0 0 1 1 1 1 1 1 1 0 0 0\r\n" + "0 0 1 1 1 1 1 1 1 0 0 0\r\n" + "0 0 1 1 1 1 1 1 1 0 0 0\r\n"
			+ "0 0 1 1 1 1 1 1 1 0 0 0\r\n" + "0 0 0 0 0 0 0 0 0 0 0 0";
}
