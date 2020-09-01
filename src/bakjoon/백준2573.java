import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 백준2573 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      StringTokenizer st = new StringTokenizer(br.readLine());
	      
	        row = Integer.parseInt(st.nextToken());
	        col = Integer.parseInt(st.nextToken());
	    
	 
		 
		
		 map = new int[row][col];
		
		for(int i = 0; i < row; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < col; j++) {
				map[i][j] =Integer.parseInt(st.nextToken());
				System.out.print(map[i][j]+" ");
				
			}
			System.out.println();
		}
		count = 0;
		while(true) {
			if(dfs() >= 2)
				break;
			
			removeIce();
			count++;
			
			
			
		}
		System.out.println(count);
		/*
		System.out.println();
		for(int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) { 
				System.out.print(map[i][j]+" ");
				
			}
			System.out.println();
		}*/
	}
	static int[][] map;
	static int count;
	static int row;
	static int col;
	static public int dfs() {
		Queue<Location> queue = new LinkedList<Location>();
		
		int[] dx = {0,1,0,-1};
		int[] dy = {-1,0,1,0};
		
		Location start; 
		int cnt = 0;
		boolean[][] visited = new boolean[row][col]; 
		
		for(int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				//System.out.println("map["+i+"]["+j+"] 진행중..");
				if(map[i][j] != 0 && !visited[i][j]) {
					visited[i][j] = true; 
					 queue.offer(new Location(i, j));
					 while(!queue.isEmpty()) {
						 Location temp = queue.poll();
						 
						 for(int k = 0; k<4; k++) {
							 int moveX = temp.x+dx[k];
							 int moveY = temp.y+dy[k];
							 //System.out.println(moveX+", " + moveY+ ", " + k + "진행중..");
							 if(isIn(moveX, moveY) && map[moveX][moveY] != 0) {
								 if(!visited[moveX][moveY]) {
									 visited[moveX][moveY] = true;
									 queue.offer(new Location(moveX, moveY));
								 }
							 }
						 }
						 
					 }
					 cnt++;
					 
					 
				}
			}
		}
		//System.out.println(cnt);
		return cnt;
		
	}
	static class Location{
		int x;
		int y;
		public Location(int i, int j) {
			this.x = i;
			this.y = j;
		}
		@Override
		public String toString() {
			return "location [x=" + x + ", y=" + y + "]";
		}
		
		 
	}
	static public void removeIce() {
		
		int[][] temp = new int[row][col]; 
		int[] dx = {0,1,0,-1};
		int[] dy = {-1,0,1,0};
		
		for(int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(map[i][j] != 0) {
					temp[i][j] = map[i][j];
					
					 for(int k = 0; k<4; k++) {
						 int moveX = i+dx[k];
						 int moveY = j+dy[k];
						 if(map[moveX][moveY] == 0) {
								temp[i][j]--;
							}
					 } 
					if(temp[i][j] < 0) {
						temp[i][j] = 0;
					}
					
				} 
				
			} 
		}	 
		
		for(int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(map[i][j] != 0) {
					map[i][j] = temp[i][j];
				}
			}
		} 
		
	}

	static public boolean isIn(int x, int y) {
		return x >= 0 && x < row && y >=0 && y < col ? true : false;
	}
	static String aa ="5 7\r\n" + 
			"0 0 0 0 0 0 0\r\n" + 
			"0 2 4 5 3 0 0\r\n" + 
			"0 3 0 2 5 2 0\r\n" + 
			"0 7 6 2 4 0 0\r\n" + 
			"0 0 0 0 0 0 0";
}
