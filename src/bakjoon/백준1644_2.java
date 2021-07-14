package bakjoon;

import java.util.*;

public class 백준1644_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		int n = scanner.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		for (int i = 2; i <= n; i++) {
			boolean flag = false;
			for (int j = 2; j <= i - 1; j++) {
				if (i % j == 0) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				list.add(i);
			}
		}
		int i = 0;
		int j = 0;
		int sum = 0;
		int count = 0; 
		while (true) {
			if (j == list.size()) {
				break;
			}
			sum += list.get(i);
			
			
			if (sum == n) {
				count++;
				sum = 0;
				j++;
				i = j;
			} else if (sum > n) {
				sum = 0;
				j++;
				i = j;
			} else if(i == list.size() - 1) {
				j++;
				i = j;
			} else {
				i++;
			}
			
		}
		System.out.println(count);
	}

	static String aa = "53";
}
