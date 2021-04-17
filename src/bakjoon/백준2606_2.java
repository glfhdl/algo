package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class 백준2606_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		int edge = Integer.parseInt(bf.readLine()); 
		
		ArrayList<Integer>[] arr = new ArrayList[n+1];
		
		for(int i = 0 ; i < n+1; i++) {
			arr[i] = new ArrayList<Integer>();
		}
		
		StringTokenizer st;
		for(int i = 0 ; i < edge; i++) {
			st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a].add(b);
			arr[b].add(a);
		}
		
		int count = 0;
		
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(1);
		boolean[] visited = new boolean[n+1];
		visited[1] = true;
		
		while(!queue.isEmpty()) {
			int temp = queue.poll(); 
			for(int i = 0; i < arr[temp].size(); i++) {
				if(!visited[arr[temp].get(i)]) {
					visited[arr[temp].get(i)] = true;
					count++;
					queue.offer(arr[temp].get(i));
				}
			}
		}
		
		System.out.println(count);

	}
	static String aa = "7\r\n" + 
			"6\r\n" + 
			"1 2\r\n" + 
			"2 3\r\n" + 
			"1 5\r\n" + 
			"5 2\r\n" + 
			"5 6\r\n" + 
			"4 7";

}
