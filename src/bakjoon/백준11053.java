package bakjoon;

import java.util.PriorityQueue;
import java.util.*;

public class 백준11053 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		scanner = new Scanner(aa);
		int n = scanner.nextInt();

		int[] arr = new int[n];
		
		for(int i = 0; i <n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int count = 0;
		Arrays.sort(arr);
		
		int t = arr[0];
		for(int i : arr) {
			if(t != i) {
				count++;
				t = i;
			}
		}
		
		System.out.println(count + 1);
	}

	static String aa ="6\r\n"
			+ "10 20 10 30 20 50";
}
