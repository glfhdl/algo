package bakjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class 백준11651_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);
		
		int n = scanner.nextInt();
		ArrayList<XY> list = new ArrayList<XY>();
		for(int i =0; i < n; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			list.add( new XY(x,y));
		}
		
		Collections.sort(list, new Comparator<XY>() {

			@Override
			public int compare(XY o1, XY o2) {
				// TODO Auto-generated method stub
				if(o1.y == o2.y) {
					if(o1.x < o2.x) {
						return -1;
					}
				}else if (o1.y < o2.y) {
					return -1;
				}
				return 1;
			}
		});
		
		for(XY a : list) {
			System.out.println(a);
		}
	}
	static class XY{
		int x;
		int y;
		public XY(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		@Override
		public String toString() {
			return x + " " + y ;
		}
		
		
	}
	static String aa = "5\r\n" + 
			"0 4\r\n" + 
			"1 2\r\n" + 
			"1 -1\r\n" + 
			"2 2\r\n" + 
			"3 3";

}
