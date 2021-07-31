package bakjoon;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class 백준1874 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		Stack<Integer> stack = new Stack();
		int t = 1;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			while (true) {
				if (stack.isEmpty()) { 
						sb.append("+\n");
						stack.add(t);
						t++; 
				}

				if (stack.peek().intValue() == arr[i]) {
					sb.append("-\n");
					stack.pop();
					break;
				} else if (stack.peek().intValue() < arr[i]) {
					sb.append("+\n");
					stack.add(t);
					t++;
				}  else {
					System.out.println("NO");
					return;
				}

			}
		}
		System.out.print(sb.toString());

	}

	static String aa = "4\r\n" + "1 2 3 4";

}
