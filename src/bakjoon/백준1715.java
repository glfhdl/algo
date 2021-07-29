package bakjoon;

import java.util.PriorityQueue;
import java.util.Scanner;

public class 백준1715 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		scanner = new Scanner(aa);
		int n = scanner.nextInt();

		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for (int i = 0; i < n; i++) {
			queue.offer(scanner.nextInt());
		}

		int sum = queue.poll();
		int t = 0;
		while(!queue.isEmpty()) {
			//System.out.println(queue.toString());
			sum += queue.poll();
			if(queue.size() > 0)
				queue.offer(sum);
			t++;
			if(t >= n)
				break;
		} 
		System.out.println(sum);
	}

	static String aa = "3\r\n" + "10\r\n" + "20\r\n" + "40";
}
