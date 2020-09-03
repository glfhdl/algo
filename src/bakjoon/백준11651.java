package bakjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class 백준11651 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);
		
		int total = scanner.nextInt();
		
		ArrayList<xy> array = new ArrayList<xy>();
		
		for(int i = 0; i < total; i++) {
			array.add(new xy(scanner.nextInt(), scanner.nextInt())); 
		}
		//Arrays.sort(array, new Comparator<ArrayList<String>>() {
		Collections.sort(array, new Comparator<xy>() {

			@Override
			public int compare(xy o1, xy o2) {
				// TODO Auto-generated method stub
				if(o1.y > o2.y) {
					return 1;
				}else if(o1.y == o2.y) {
					if(o1.x > o2.x) {
						return 1;
					}
				}
				return -1;
			}

		 
			
		});
		
		
		for(int i = 0; i < total; i++) {
			System.out.println(array.get(i).toString());
		}

	}
	
	static class xy{
		int x;
		int y;
		public xy(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		@Override
		public String toString() {
			return x + " " + y;
		}
		
		 
	}

	static String aa = "5\r\n" + 
			"0 4\r\n" + 
			"1 2\r\n" + 
			"1 -1\r\n" + 
			"2 2\r\n" + 
			"3 3";
}
