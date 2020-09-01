import java.util.Scanner;

public class 백준19236 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		map = new int[4][8];
//		Scanner scanner = new Scanner(System.in);
		Scanner scanner = new Scanner(aa);

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 8; j++) {
				map[i][j] = scanner.nextInt();
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}

		int sum = map[0][0];
		map[0][0] = 0;
		move();

	}

	static int[][] map;
	static int[] move = { 1, 2, 3, 4, 5, 6, 7, 8 };
	static int[] dx = { 0, -1, -1, -1, 0, 1, 1, 1 };
	static int[] dy = { -1, -1, 0, 1, 1, 1, 0, -1 };

	public static void move() {

		for (int i = 1; i <= 16; i++) {
			for (int n = 0; n < 4; n++) {
				for (int m = 0; m < 8; m++) {
					if (m % 2 == 0 && map[n][m] != 0 && map[n][m] == i) {
						// swap
						System.out.println(n + " " + m + "에서 멈춤11");
						int direct = map[n][m+1] - 1;
						int moveX = n + dx[direct];
						int moveY = m + dy[direct];

						while (!isIn(moveX, moveY)) {
							if (direct == 8) {
								direct = 0;
							} else {
								direct++;
							}
							moveX = n + dx[direct];
							moveY = m + dy[direct];
						}
						System.out.println(moveX + " " + moveY + "에서 멈춤");
						int tempN = map[n][m];// 번호값
						int tempD = map[n + 1][m]; // 방향값

					}
				}
			}
		}

	}

	public static boolean isIn(int x, int y) {
		return x >= 0 && y >= 0 && x < 4 && y < 4 ? true : false;
	}

	public static String aa = "7 6 2 3 15 6 9 8\r\n" + "3 1 1 8 14 7 10 1\r\n" + "6 1 13 6 4 3 11 4\r\n"
			+ "16 1 8 7 5 2 12 2";
}
