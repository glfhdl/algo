package bakjoon;
 
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
 

public class 백준11279_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		int n = scanner.nextInt(); 
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
		for (int i = 0; i < n; i++) {
			int t = scanner.nextInt();
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
	static String aa ="13\r\n"
			+ "0\r\n"
			+ "1\r\n"
			+ "2\r\n"
			+ "0\r\n"
			+ "0\r\n"
			+ "3\r\n"
			+ "2\r\n"
			+ "1\r\n"
			+ "0\r\n"
			+ "0\r\n"
			+ "0\r\n"
			+ "0\r\n"
			+ "0";
}
