package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
 

public class 백준1927_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());

		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		for(int i = 0; i < n; i++) {
			int t = Integer.parseInt(bf.readLine());
			if(t == 0) {
				if(queue.isEmpty()) {
					System.out.println(0);
				}else {
					System.out.println(queue.poll());
				}
			}else {
				queue.offer(t);
			}
			 
		}
		
	}

	static String aa = "9\r\n" + 
			"0\r\n" + 
			"12345678\r\n" + 
			"1\r\n" + 
			"2\r\n" + 
			"0\r\n" + 
			"0\r\n" + 
			"0\r\n" + 
			"0\r\n" + 
			"32";
}
