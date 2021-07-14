package bakjoon;

import java.util.*;

public class 백준15686 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		n = scanner.nextInt();
		int m = scanner.nextInt();

		map = new int[n][n];
		list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = scanner.nextInt();

			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] == 2) {
					bfs(i, j);
					System.out.println("MRc");
				}

			}
		}

		System.out.println(list.toString());

	}

	static int map[][];
	static int n;
	static ArrayList<Integer> list;

	static void bfs(int x, int y) {

		int dx[] = { 1, 0, -1, 0 };
		int dy[] = { 0, 1, 0, -1 };

		boolean[][] visited = new boolean[n][n];

		Queue<XY> queue = new LinkedList<XY>();
		queue.offer(new XY(x, y));
		visited[x][y] = true;

		int count = 0;
		int sum = 0;
		while (!queue.isEmpty()) {
			XY temp = queue.poll();
			count++;
			for (int i = 0; i < 4; i++) {
				int moveX = dx[i] + temp.x;
				int moveY = dy[i] + temp.y;
				if (isIn(moveX, moveY) && !visited[moveX][moveY]) {

					if (map[moveX][moveY] == 1) {
						sum += count;

					} else if (map[moveX][moveY] == 0) {

					}

					visited[moveX][moveY] = true;
					queue.offer(new XY(moveX, moveY));
				}
			}

		}

		list.add(sum);

	}

	static boolean isIn(int x, int y) {
		return x >= 0 && y >= 0 && x < n && y < n ? true : false;
	}

	static class XY {
		int x;
		int y;

		public XY(int x, int y) {
			this.x = x;
			this.y = y;

		}

		@Override
		public String toString() {
			return "XY [x=" + x + ", y=" + y + "]";
		}
	}

	static String aa = "5 3\r\n" + "0 0 1 0 0\r\n" + "0 0 2 0 1\r\n" + "0 1 2 0 0\r\n" + "0 0 1 0 0\r\n" + "0 0 0 0 2";

}
