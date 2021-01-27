package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList; 
 

public class 백준10866_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		 
		int n = Integer.parseInt(bf.readLine());

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			String order = bf.readLine();

			if (order.equals("front")) {
				if (!list.isEmpty()) {
					System.out.println(list.get(0));
				} else {
					System.out.println(-1);
				}
			} else if (order.equals("back")) {
				if (!list.isEmpty()) {
					System.out.println(list.get(list.size() - 1));
				} else {
					System.out.println(-1);
				}
			} else if (order.equals("empty")) {
				if (list.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			} else if (order.equals("size")) {
				System.out.println(list.size());
			} else if (order.contains("push_front")) {
				String[] temp = order.split(" ");
				int t = Integer.parseInt(temp[1]);
				System.out.println(temp[0] + " " + temp[1]);
				list.add(0, t);
			} else if (order.contains("push_back")) {
				String[] temp = order.split(" ");
				int t = Integer.parseInt(temp[1]);
				list.add(  t);
			} else if (order.contains("pop_front")) {
				if (list.size() >=1) {
					System.out.println(list.get(0));
					list.remove(0);
				} else {
					System.out.println(-1);
				}
			} else if (order.contains("pop_back")) {
				if (list.size() >= 1) {
					System.out.println(list.get(list.size() - 1));
					list.remove((list.size() - 1));
				} else {
					System.out.println(-1);
				}
			}

		}

	}

	static String aa = "15\r\n" + "push_back 1\r\n" + "push_front 2\r\n" + "front\r\n" + "back\r\n" + "size\r\n"
			+ "empty\r\n" + "pop_front\r\n" + "pop_back\r\n" + "pop_front\r\n" + "size\r\n" + "empty\r\n"
			+ "pop_back\r\n" + "push_front 3\r\n" + "empty\r\n" + "front";

}
