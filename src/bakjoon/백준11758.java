/*
1시간 반 걸렸다
씨발 신발끝 공식??씬발~~
*/
package bakjoon;

import java.util.Scanner;

public class 백준11758 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		int x3 = scanner.nextInt();
		int y3 = scanner.nextInt();

		double a;
		if (y1 - y2 == 0 || x1 - x2 == 0) {
		 if(y1 - y2 == 0) {
			if (x3 == 0) {
				System.out.println(0); // 기울기 0 일직선
			} else if (y3 < 0) {
				System.out.println(1); // 반시계
			} else {
				System.out.println(-1);// 시계
			}
		 }else {
			 if (y3 == 0) {
					System.out.println(0); // 기울기 0 일직선
				} else if (x1 < 0) {
					System.out.println(1); // 반시계
				} else {
					System.out.println(-1);// 시계
				}
		 }
		} else {
			a = (y1 - y2) / (x1 - x2);

			double b = y1 - (a * x1);

			if (x3 * a + b == y3) {
				System.out.println(0);
			} else {
				if (x3 * a + b > y3) {
					System.out.println(-1);
				} else {
					System.out.println(1); // 반시계
				}
			}

		}

	}

	static String aa = "1 1\r\n" + "7 3\r\n" + "5 5";
}
