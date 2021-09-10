package bakjoon;

import java.util.*;

public class 백준1654 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		int k = scanner.nextInt(); // 갖고있는 랜선 개수 k
		int n = scanner.nextInt(); // 필요한 랜선 개수 n

		int[] lanes = new int[k];

		int sum = 0;
		for (int i = 0; i < k; i++) {
			lanes[i] = scanner.nextInt();
			sum += lanes[i];
		}
		Arrays.sort(lanes);
	 
		//이분탐색 
		
		long mid = 0;
		long low = 1, high = lanes[k-1];
		while(low <= high) {
			mid = (low + high) / 2;
			
			long count = 0;
			for (int i = 0; i < k; i++) {
				count += lanes[i]/mid;
			}

			if(count >= n) {
				low = mid + 1; 
			} else {
				high = mid - 1;
			}  
		}
		
		System.out.println(high);

	}

	static String aa = "4 11\r\n" + "802\r\n" + "743\r\n" + "457\r\n" + "539";

}
