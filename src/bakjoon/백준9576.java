package bakjoon;

import java.util.Arrays;
import java.util.*;

public class 백준9576 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);
		int t = scanner.nextInt();
		for (int tc = 0; tc < t; tc++) {
			int n = scanner.nextInt(); // 책 개수
			int m = scanner.nextInt(); // 애들

			Book[] arr = new Book[m ];
 
			for (int i = 0; i < m; i++) {
				arr[i] = new Book(scanner.nextInt(), scanner.nextInt());
			}

			Arrays.sort(arr, new Comparator<Book>() {
				@Override
				public int compare(Book o1, Book o2) {
					if(o1.b < o2.b) {
						return -3;
					}else if(o1.b == o2.b) {
						if(o1.a < o2.a) {
							return -2;
						} 
					}
					return 1;
				}
			});
			
			boolean[] flag = new boolean[n+1];
			int count = 0;
			for (int i = 0; i < m; i++) {
				for(int j = arr[i].a; j <= arr[i].b; j++) {
					if(!flag[j]) {
						flag[j] = true;
						count++;
						break;
					}
				}
			}
			
			System.out.println(Arrays.toString(arr));
			System.out.println(count);
		}
	}

	static class Book {
		int a;
		int b;
		int diff;

		public Book(int a, int b) {
			super();
			this.a = a;
			this.b = b;
			this.diff = b-a;
		}

		@Override
		public String toString() {
			return "Book [a=" + a + ", b=" + b + "]\n";
		}

	}

	static String aa = "1\r\n"
			+ "3 3\r\n"
			+ "1 2\r\n"
			+ "\r\n"
			+ "1 3\r\n"
			+ "\r\n"
			+ "2 2";

}
