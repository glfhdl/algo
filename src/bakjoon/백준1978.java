package bakjoon;

import java.util.Scanner;

public class 백준1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);
		
		int n = scanner.nextInt();
		int count = 0;
		for(int i = 0 ; i < n; i++) {
			int t = scanner.nextInt();
			System.out.println("t:"+t);
			if(right(t))
				count++;
		}
		System.out.println(count);

	}
	static boolean right(int x) {
		if (x < 2)
			return false;
		
		for(int i = 2; i < x; i++) {
			System.out.println(i);
			if(x%i == 0)
				return false;
		}
		return true;
	}
	static String aa = "4\r\n" + 
			"1 3 5 7";

}
