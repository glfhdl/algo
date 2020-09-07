package bakjoon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class 백준1966 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		int tc = scanner.nextInt();
		for (int t = 0; t < tc; t++) {
			int n = scanner.nextInt(); // 문서의수
			int m = scanner.nextInt(); // 이 문서가 몇번째로 출력되는지

			Queue<prints> array = new LinkedList<prints>();
			PriorityQueue<Integer> order = new PriorityQueue<Integer>(new Comparator() {

				@Override
				public int compare(Object o1, Object o2) {
					// TODO Auto-generated method stub
					if ((int) o1 > (int) o2)
						return -1;
					return 1;
				}

			});
			for (int i = 0; i < n; i++) {
				int tt = scanner.nextInt();
				array.offer(new prints(i, tt));
				order.offer(tt);
			}
			//System.out.println(array.toString());
			//System.out.println(order.toString());

			int count = 1;
			while (true) {
				prints temp = array.poll(); 
				if (temp.idx == m && temp.importance == order.peek()) {
					System.out.println(count);
					break;
				}

				if (temp.importance == order.peek()) {
					order.poll();
					count++;
				} else {
					array.offer(temp);
				}
				
				

			}

		}
	}

	static class prints {
		int idx;
		int importance;

		public prints(int idx, int importance) {
			super();
			this.idx = idx;
			this.importance = importance;
		}

		@Override
		public String toString() {
			return "prints [idx=" + idx + ", importance=" + importance + "]";
		}

	}

	static String aa = "3\r\n" + "1 0\r\n" + "5\r\n" + "4 2\r\n" + "1 2 3 4\r\n" + "6 0\r\n" + "1 1 9 1 1 1";

}
