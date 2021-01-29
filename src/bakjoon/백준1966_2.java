package bakjoon;
 
import java.util.*; 

public class 백준1966_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);
		
		int tc = scanner.nextInt();
		for(int i = 0; i < tc; i++) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			Queue<Prints> queue = new LinkedList<Prints>();
			PriorityQueue<Integer> order = new PriorityQueue<Integer>(new Comparator<Integer>() {
 
				@Override
				public int compare(Integer o1, Integer o2) {
					// TODO Auto-generated method stub
					if ((int) o1 > (int) o2)
						return -1;
					return 1;
				}

			});
			for (int j = 0; j < n; j++) {
				int tt = scanner.nextInt();
				queue.offer(new Prints(j, tt));
				order.offer(tt);
			}
			
			int count = 1;
			while (true) {
				Prints temp = queue.poll(); 
				if (temp.idx == m && temp.importance == order.peek()) {
					System.out.println(count);
					break;
				}

				if (temp.importance == order.peek()) {
					order.poll();
					count++;
				} else {
					queue.offer(temp);
				}
				
				

			}
		}
	}
	static class Prints {
		int idx;
		int importance;

		public Prints(int idx, int importance) {
			super();
			this.idx = idx;
			this.importance = importance;
		}

		@Override
		public String toString() {
			return "prints [idx=" + idx + ", importance=" + importance + "]";
		}

	}
	static String aa = "3\r\n" + 
			"1 0\r\n" + 
			"5\r\n" + 
			"4 2\r\n" + 
			"1 2 3 4\r\n" + 
			"6 0\r\n" + 
			"1 1 9 1 1 1";

}
