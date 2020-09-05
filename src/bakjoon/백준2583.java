package bakjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 백준2583 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		int m = scanner.nextInt();
		int n = scanner.nextInt();

		map = new int[n][m];
		int k = scanner.nextInt();

		for (int i = 0; i < k; i++) {
			int x1 = scanner.nextInt();
			int y1 = scanner.nextInt();

			int x2 = scanner.nextInt();
			int y2 = scanner.nextInt(); 
			
			for(int a = x1; a < x2; a++ ) {
				for(int b = m-y2; b < m-y1; b++ ) {
					//System.out.println(a + ", " + b);
					map[a][b] = 1;
				}
			}
		}
		 
		
		int[] dx = {1,0,-1,0};
		int[] dy = {0,1,0,-1};
		
		boolean[][] visited = new boolean[n][m];
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int a = 0; a < n; a++ ) {
			for(int b = 0; b < m; b++ ) {
				if(map[a][b] == 0 && !visited[a][b]) { 
					Queue<xy> queue = new LinkedList<xy>();
					queue.add(new xy(a,b));
					visited[a][b] = true;
					int count = 0;
					while(!queue.isEmpty()) {
						xy temp = queue.poll();
						count++;
						for(int t = 0; t < 4; t++) {
							
							int moveX = temp.x + dx[t];
							int moveY = temp.y + dy[t];
						//	System.out.println(t + ":"+moveX + ", " + moveY);
							if(isIn(moveX, moveY) && !visited[moveX][moveY]
									&& map[moveX][moveY] == 0) {
								queue.offer(new xy(moveX, moveY));
								visited[moveX][moveY] = true;
								
							}
						}
						
					}
					result.add(count);
				}
			}
		 
		}
		
		System.out.println(result.size());
		Collections.sort(result);
		for(int a : result)
			System.out.print(a + " ");

	}
	static int[][] map;
	 
	static boolean isIn(int x, int y) {
		return x >= 0 && y >= 0 && x < map.length && y < map[0].length ? true :false;
	}
	static class xy{
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

	static String aa = "5 7 3\r\n" + "0 2 4 4\r\n" + "1 1 2 5\r\n" + "4 0 6 2";
}
