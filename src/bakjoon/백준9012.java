package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 백준9012 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		System.out.println(n);
		
		for(int i = 0; i < n; i++) {
			Stack<Character> stack = new Stack();
			String q = bf.readLine();
			for(int j = 0; j < q.length(); j++) {
				char temp = q.charAt(j);
				if(temp == '(') {
					stack.push(temp);
				}else {
					if(!stack.isEmpty() && stack.peek() == '(' ){
						stack.pop();
					}else {
						stack.push(temp);
					}
				} 
			}
			
			if(!stack.isEmpty()) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
			}
		}
	}

}
