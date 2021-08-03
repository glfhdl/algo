package bakjoon;

import java.util.*;

public class 백준2580 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);
		int[][] map = new int[9][9];
		ArrayList<XY> list = new ArrayList();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				int t = scanner.nextInt();
				map[i][j] = t;
				if (t == 0) {
					list.add(new XY(i, j));
				}
			}
		}

		// 가로, 세로, 3*3 세가지 탐색,

		boolean[] line = new boolean[10];
		for (int i = 0; i < list.size(); i++) {
			int x = list.get(i).x;
			int y = list.get(i).y;
			if (map[x][y] == 0) {

				ArrayList<Integer> temp = new ArrayList();
				// 가로 탐색
				for (int j = 0; j < 9; j++) {
					line[map[x][j]] = true;
				}
				for (int j = 0; j < 9; j++) {
					if (!line[map[x][j]]) {
						temp.add(map[x][j]);
					}
				}
				if (temp.size() == 1) {
					map[x][y] = temp.get(0);
				}

				// 세로 탐색
				// 1.
				for (int t = 0; t < temp.size(); t++) {
					line = new boolean[10];
					for (int j = 0; j < temp.size(); j++) {
					}
				}

				// 3*3 탐색
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

	}

	static String aa = "0 3 5 4 6 9 2 7 8\r\n" + "7 8 2 1 0 5 6 0 9\r\n" + "0 6 0 2 7 8 1 3 5\r\n"
			+ "3 2 1 0 4 6 8 9 7\r\n" + "8 0 4 9 1 3 5 0 6\r\n" + "5 9 6 8 2 0 4 1 3\r\n" + "9 1 7 6 5 2 0 8 0\r\n"
			+ "6 0 3 7 0 1 9 5 2\r\n" + "2 5 8 3 9 4 7 6 0";

}
