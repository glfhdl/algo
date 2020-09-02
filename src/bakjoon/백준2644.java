package bakjoon;
import java.util.ArrayList;
import java.util.Scanner;

public class 백준2644 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
//		Scanner scanner = new Scanner(System.in);
		Scanner scanner = new Scanner(aa);

		int n = scanner.nextInt();//총 사람
		int a = scanner.nextInt();//관계를 찾아야하는 1
		int b = scanner.nextInt();//관계를 찾아야하는 2
		int m = scanner.nextInt();//간선수
		ArrayList<Integer>[] cousin = new ArrayList[n];
		for (int i = 0; i < m; i++) {
			cousin[scanner.nextInt()].add(scanner.nextInt());
		}

		 

	}
	
	static String aa = "9\r\n" + 
			"7 3\r\n" + 
			"7\r\n" + 
			"1 2\r\n" + 
			"1 3\r\n" + 
			"2 7\r\n" + 
			"2 8\r\n" + 
			"2 9\r\n" + 
			"4 5\r\n" + 
			"4 6";
}
