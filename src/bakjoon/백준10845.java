package bakjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 백준10845 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);
		
		int n = scanner.nextInt();
	 
		Queue<Integer> queue = new LinkedList();
		for(int i = 0; i < n; i++) {
			String order = scanner.next();
			
			if(order.equals("push")) {
				int t = scanner.nextInt();
				queue.offer(t);
				
			}else if(order.equals("pop")) {
				if(!queue.isEmpty()) {
					System.out.println(queue.poll());
				}else {
					System.out.println(-1);
				}
				
			}else if(order.equals("size")) {
				System.out.println(queue.size());
				
			}else if(order.equals("empty")) {
				if(!queue.isEmpty()) {
					System.out.println(0);
				}else {
					System.out.println(1);
				}
				
			}else if(order.equals("front")) {
				if(!queue.isEmpty()) {
					System.out.println(queue.peek());
				}else {
					System.out.println(-1);
				}
				
			}else if(order.equals("back")) {
				if(!queue.isEmpty()) {
					int temp = 0;
					Iterator list = queue.iterator();
					while(list.hasNext()) {
						temp = (int) list.next();
					}
					System.out.println(temp);
				}else {
					System.out.println(-1);
				}
				
			} 
			
		} 
		for(int i = 0; i < n; i++) { 
			 
			
		}
		
	 
		
	}
	static String aa = "15\r\n" + 
			"push 1\r\n" + 
			"push 2\r\n" + 
			"front\r\n" + 
			"back\r\n" + 
			"size\r\n" + 
			"empty\r\n" + 
			"pop\r\n" + 
			"pop\r\n" + 
			"pop\r\n" + 
			"size\r\n" + 
			"empty\r\n" + 
			"pop\r\n" + 
			"push 3\r\n" + 
			"empty\r\n" + 
			"front";

}
