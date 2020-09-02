package bakjoon;
import java.util.Scanner;

public class 백준14501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		int n = scanner.nextInt();
		int[][] schedule = new int[n][2];
		for (int i = 0; i < n; i++) {
			schedule[i][0] = scanner.nextInt();
			schedule[i][1] = scanner.nextInt();

			System.out.println(schedule[i][0] + " " + schedule[i][1]);
		}

		int sum = 0;
		int max = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sum += schedule[j][1];
				// 계산중인 날 기준으로 이전보다 최대수입이 작으면 안된다.
				if (max <= sum) {
					max = sum;

				}

				i = i + schedule[i][0] - 1;
			}

		}
		System.out.println("최고값 " + sum);
	}

	static String aa = "10\r\n" + "5 50\r\n" + "4 40\r\n" + "3 30\r\n" + "2 20\r\n" + "1 10\r\n" + "1 10\r\n"
			+ "2 20\r\n" + "3 30\r\n" + "4 40\r\n" + "5 50";

}
