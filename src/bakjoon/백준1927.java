package bakjoon;

import java.util.PriorityQueue;
import java.util.Scanner;

public class 백준1927 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);
		
		int n = scanner.nextInt();
		PriorityQueue<Integer> list = new PriorityQueue();
		
		for(int i = 0; i < n; i++) {
			int t = scanner.nextInt();
			if(t == 0) {
				if(list.isEmpty())
					System.out.println(0);
				else {
					System.out.println(list.poll());
				}
			}else {
				list.offer(t);
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
