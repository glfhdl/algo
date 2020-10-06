package bakjoon;
 
import java.util.Collections;
import java.util.PriorityQueue; 
import java.util.Scanner;

public class 백준11279 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa); 
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
		int size = scanner.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			int t = scanner.nextInt();
			if( t == 0) {
				if (queue.isEmpty())
					sb.append("0\n"); 
				else
					sb.append(queue.poll() + "\n");
			}else {
				queue.offer(t);
			}
			
		}
		
		System.out.println(sb.toString());
		
		
		
	}
	static String aa = "13\r\n" + 
			"0\r\n" + 
			"1\r\n" + 
			"2\r\n" + 
			"0\r\n" + 
			"0\r\n" + 
			"3\r\n" + 
			"2\r\n" + 
			"1\r\n" + 
			"0\r\n" + 
			"0\r\n" + 
			"0\r\n" + 
			"0\r\n" + 
			"0";

}
