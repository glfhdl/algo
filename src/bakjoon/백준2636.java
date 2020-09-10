package bakjoon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
 

public class 백준2636 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		row = scanner.nextInt();
		col = scanner.nextInt();

		map = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				map[i][j] = scanner.nextInt(); 
			} 
		}

	 
		int count = 0;
		ArrayList<Integer> list = new ArrayList();
		while(true) {
			count = count1();
			list.add(count);
			
			if(count == 0) {
				if(list.size() == 1) {
					System.out.println(0);
					System.out.println(0);
					break;
				}
				System.out.println(list.size()-1);
				System.out.println(list.get(list.size()-2));
				break;
			}
			rmCheese();
		}
	}

	static int count1() {
		int count = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(map[i][j] == 1)
					count++;
			} 
		}
		return count;
	}
	static void rmCheese() {
		int[] dx = { 1, 0, -1, 0 };
		int[] dy = { 0, 1, 0, -1 };

		// 공기층을 -1로 만들기

		togo: for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (map[i][j] == 0) {
					Queue<XY> queue = new LinkedList();
					queue.offer(new XY(i, j));
					boolean[][] visited = new boolean[row][col];
					visited[i][j] = true;
					map[i][j] = -1;
					while (!queue.isEmpty()) {
						XY temp = queue.poll();

						for (int k = 0; k < 4; k++) {
							int moveX = temp.x + dx[k];
							int moveY = temp.y + dy[k];

							if (isIn(moveX, moveY) && !visited[moveX][moveY] && map[moveX][moveY] == 0) {
								queue.offer(new XY(moveX, moveY));
								map[moveX][moveY] = -1;
								visited[moveX][moveY] = true;
							}
						}
					}
					break togo;
				}
			}
		}

		boolean[][] check = new boolean[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (map[i][j] == 1) {

					for (int k = 0; k < 4; k++) {
						int moveX = i + dx[k];
						int moveY = j + dy[k];

						if (isIn(moveX, moveY) && map[moveX][moveY] == -1) {

							check[i][j] = true;
							break;
						}
					}
				}

			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (check[i][j]) {
					map[i][j] = -1;
				}
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

	static int row;
	static int col;
	static int[][] map;

	static boolean isIn(int x, int y) {
		return x >= 0 && y >= 0 && x < row && y < col ? true : false;

	}

	static String aa ="13 12\r\n" + 
			"0 0 0 0 0 0 0 0 0 0 0 0\r\n" + 
			"0 0 0 0 0 0 0 0 0 0 0 0\r\n" + 
			"0 0 0 0 0 0 0 1 1 0 0 0\r\n" + 
			"0 1 1 1 0 0 0 1 1 0 0 0\r\n" + 
			"0 1 1 1 1 1 1 0 0 0 0 0\r\n" + 
			"0 1 1 1 1 1 0 1 1 0 0 0\r\n" + 
			"0 1 1 1 1 0 0 1 1 0 0 0\r\n" + 
			"0 0 1 1 0 0 0 1 1 0 0 0\r\n" + 
			"0 0 1 1 1 1 1 1 1 0 0 0\r\n" + 
			"0 0 1 1 1 1 1 1 1 0 0 0\r\n" + 
			"0 0 1 1 1 1 1 1 1 0 0 0\r\n" + 
			"0 0 1 1 1 1 1 1 1 0 0 0\r\n" + 
			"0 0 0 0 0 0 0 0 0 0 0 0";
}
