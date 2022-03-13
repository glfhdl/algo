package programmers;

import java.util.PriorityQueue;

public class 더맵게 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		int count = 0;
		for(int i = 0 ; i < scoville.length; i++) {
			pq.offer( scoville[i]);
		}
		
		while(true) {
			if(pq.peek() >= K)
				break;
			if(pq.isEmpty()) {
				count = -1;
				break;
			}
			int temp = pq.poll();
			if(pq.isEmpty()) {
				count = -1;
				break;
			}
			temp += 2*pq.poll();
			pq.offer(temp);
			count++;
		}
		
		System.out.println(count);
	}

}
