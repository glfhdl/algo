package programmers;

import java.util.*;

public class 카카오프렌즈컬러링북 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 6;
		int n = 4;
		int[][] picture = {{1, 1, 1, 0}, {1, 1, 1, 0}, {0, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 1}};
		X = m;
		Y = n;  
		int max = 0;
		int area = 0;
		int[] dx = { 0, 1, 0, -1 };
		int[] dy = { 1, 0, -1, 0 };
		boolean[][] visited = new boolean[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) { 
				if (!visited[i][j] && picture[i][j] != 0) {
					area++;
					int count = 1;
					visited[i][j] = true;
					Queue<XY> queue = new LinkedList<>();
					queue.offer(new XY(i, j));

					while (!queue.isEmpty()) {
						XY temp = queue.poll();

						for (int t = 0; t < 4; t++) {
							int moveX = temp.x + dx[t];
							int moveY = temp.y + dy[t];

							if (isIn(moveX, moveY) && !visited[moveX][moveY] && picture[i][j] == picture[moveX][moveY]) {
								count++;
								visited[moveX][moveY] = true;
								queue.offer(new XY(moveX, moveY));
							}
						}
					}
					
					max = Math.max(max, count);
				}
			}
		}
		System.out.println(area);
		System.out.println(max);
	}

	static int X, Y;

	static class XY {
		int x;
		int y;

		public XY(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static boolean isIn(int x, int y) {
		return x >= 0 && y >= 0 && x < X && y < Y ? true : false;
	}

}
