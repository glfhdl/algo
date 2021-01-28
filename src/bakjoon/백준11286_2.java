package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class 백준11286_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if (Math.abs(o1) > Math.abs(o2))

					return 1;
				else if (Math.abs(o1) == Math.abs(o2)){
					if(o1 < o2)
						return -1;
					else {
						return 1;
					}
				}else {
					return -1;
				}
			}
		});

		int x = 0;
		for (int i = 0; i < n; i++) {

			x = Integer.parseInt(bf.readLine());
			if (x != 0) {
				pq.offer(x);
			} else {
				if(pq.isEmpty()) {
					System.out.println(0);
				}else {
					System.out.println(pq.poll());
				}
				
			}
		}

	}

}
