package bakjoon;

import java.util.PriorityQueue;
import java.util.Scanner;

public class 백준10867 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);
		int n = scanner.nextInt();
		PriorityQueue pq = new PriorityQueue<Integer>();
		for(int i = 0; i < n; i++) {
			int t = scanner.nextInt();
			if(!pq.contains(t))
				pq.offer(t);
		}
		while(!pq.isEmpty()) {
			System.out.print(pq.poll()+" ");
		} 
	}
	static String aa = "10\r\n" + 
			"1 4 2 3 1 4 2 3 1 2";

}
