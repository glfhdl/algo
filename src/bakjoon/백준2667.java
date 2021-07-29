package bakjoon;

import java.util.*;

public class 백준2667 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		scanner = new Scanner(aa);
		n = scanner.nextInt();

		map = new int[n][n];

		for (int i = 0; i < n; i++) {
			String temp = scanner.next();
			for (int j = 0; j < n; j++) {
				map[i][j] =  temp.charAt(j) - '0';
			}
		}

		visited = new boolean[n][n];
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] == 1 && !visited[i][j]) {
					count = 0;
					visited[i][j] = true;
					dfs(i, j);
					list.add(count + 1);
				}
			}
		}
		Collections.sort(list);
		System.out.println(list.size());
		for (int a : list) {
			System.out.println(a);
		}
	}

	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };
	static int count;

	static public void dfs(int x, int y) {

		for (int i = 0; i < 4; i++) {

			int moveX = dx[i] + x;
			int moveY = dy[i] + y;

			if (isIn(moveX, moveY) && !visited[moveX][moveY] && map[moveX][moveY] == 1) {
				count++;
				visited[moveX][moveY] = true;
				dfs(moveX, moveY);
			}

		}

	}

	static boolean isIn(int x, int y) {
		return x >= 0 && y >= 0 && x < n && y < n ? true : false;
	}

	static boolean[][] visited;
	static int n;
	static int[][] map;

	static String aa = "7\r\n" + "0110100\r\n" + "0110101\r\n" + "1110101\r\n" + "0000111\r\n" + "0100000\r\n"
			+ "0111110\r\n" + "0111000";

}
