package bakjoon;

import java.util.Scanner;
 

public class 백준11052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		int n = scanner.nextInt();
		cards = new int[n];
		int[] order = new int[n];
		for (int i = 0; i < n; i++) {
			cards[i] = scanner.nextInt();
			order[i] = n + 1;
		}

		int t = 0;
		int max1 = cards[n-1]; 

		reCombination(order, n, n, 0, 0);
		System.out.println(max);

	}// 중복 조합 (순서관심없고 뽑은 유무만 생각 + 자기자신도 포함)

	static int max;
	static int[] cards;

	private static void reCombination(int[] reComArr, int n, int r, int index, int target) {
		if (r == 0) {
			int sum = 0;
			int temp = 0;
			for (int i : reComArr) {
				sum += i;
			}
			if (sum == n) {
				for (int i : reComArr) {
					System.out.print(i + " ");
					if (i != 0) {
						temp += cards[i - 1];
					}
				}
				max = Math.max(max, temp);
				System.out.println();
			}
			return;
		}
		if (target == n)
			return;

		reComArr[index] = target;
		reCombination(reComArr, n, r - 1, index + 1, target);// 뽑는경우
		reCombination(reComArr, n, r, index, target + 1);// 안뽑는경우

	}

	static String aa ="10\r\n" + 
			"5 10 11 12 13 30 35 40 45 47";
}
