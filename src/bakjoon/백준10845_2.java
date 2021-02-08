package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
 

public class 백준10845_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		ArrayList<Integer> queue = new ArrayList<Integer>();
		for(int i =0 ; i < n; i++) {
			String order = bf.readLine();
			if(order.contains("push")) {
				String[] temp = order.split(" ");
				queue.add(Integer.parseInt(temp[1]));
				
			} else if(order.contains("pop")) {
				if(!queue.isEmpty()) {
					System.out.println(queue.get(0));
					queue.remove(0);
				}else {
					System.out.println(-1);
				}
			}else if(order.contains("size")) {
				System.out.println(queue.size());
			}else if(order.contains("empty")) {
				if(queue.isEmpty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
			}else if(order.contains("front")) {
				if(!queue.isEmpty()) {
					System.out.println(queue.get(0));
				}else {
					System.out.println(-1);
				}
			}else if(order.contains("back")) {
				if(!queue.isEmpty()) {
					System.out.println(queue.get(queue.size()-1));
				}else {
					System.out.println(-1);
				}
			}
		}
	}

}
