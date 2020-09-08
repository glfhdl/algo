package bakjoon;

import java.util.Scanner;

public class 백준2661 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);
		int n = scanner.nextInt();
		
		for(int i = 0; i < n; i++) {
			if(i % 4 == 0)
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
