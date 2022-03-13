package bakjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 백준9205 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 0525 start 0605 해설찾아봄\
		// 0631 시작
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		int tc = scanner.nextInt();
		for (int tt = 0; tt < tc; tt++) {
			int beer = 20;
			int n = scanner.nextInt();
			int[][] con = new int[n + 1][2];

			Queue<XY> queue = new LinkedList();
			XY home = new XY(scanner.nextInt(), scanner.nextInt());
			queue.offer(home);

			for (int i = 0; i < n; i++) {
				con[i][0] = scanner.nextInt();
				con[i][1] = scanner.nextInt();
			}

			con[n][0] = scanner.nextInt();
			con[n][1] = scanner.nextInt();

			boolean[] visited = new boolean[n + 1];
			while (!queue.isEmpty()) {
				XY temp = queue.poll();

				for (int i = 0; i < n + 1; i++) {
					if (!visited[i]) {
						
						int t = Math.abs(temp.x - con[i][0]) + Math.abs(temp.y - con[i][1]);
						if (t <= 1000) { 
							visited[i] = true;
							queue.offer(new XY(con[i][0], con[i][1]));
						}
					}
				}

			}

			if (!visited[n]) {
				System.out.println("sad");

			} else {
				System.out.println("happy");
			}

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

	static String aa = "2\r\n" + "2\r\n" + "0 0\r\n" + "1000 0\r\n" + "1000 1000\r\n" + "2000 1000\r\n" + "2\r\n"
			+ "0 0\r\n" + "1000 0\r\n" + "2000 1000\r\n" + "2000 2000";
}
