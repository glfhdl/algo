package bakjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 백준10828 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = 0; i < n; i++) {
			String[] st = bf.readLine().split(" ");
			if(st[0].equals("push")) {
				stack.push(Integer.parseInt(st[1]));
			}else if(st[0].equals("pop")) {
				if(stack.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(stack.pop());
				} 
			}else if(st[0].equals("size")) {
				System.out.println(stack.size());
			}else if(st[0].equals("empty")) {
				if(stack.isEmpty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				} 
			}else if(st[0].equals("top")) {
				if(stack.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(stack.peek());
				} 
			} 
		}

	}

}
