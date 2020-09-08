package bakjoon;

import java.util.Scanner;

public class 백준2661 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);
		int n = scanner.nextInt();
		int[] array = new int[n];
		array[0] = 1;
		for(int i = 1; i < n; i++) {
			if(array[i] == 0)
				System.out.print(1);
			if(i % 4 == 1)
				System.out.print(2);
			if(i % 4 == 2)
				System.out.print(1);
			if(i % 4 == 3)
				System.out.print(3);
		}
	}

	static String aa = "12";
}
