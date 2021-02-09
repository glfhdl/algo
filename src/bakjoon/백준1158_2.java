package bakjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 백준1158_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);
		
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i = 0; i <n; i++) {
			queue.offer(i+1);
		}
		
		int i = 1;
		System.out.print("<");
		while(!queue.isEmpty()) {
			if(k == i) {
				i = 1;
				if(queue.size() != 1)
					System.out.print(queue.poll() + ", ");
				else
					System.out.println(queue.poll() + ">");
			}else {
				i++;
				queue.offer(queue.poll());
			}
		}
	}
	static String aa = "7 3";

}
