package bakjoon;

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 백준1912 {

	public static void main(String[] args)throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine()); 
		Time[] arr = new Time[n];

		for (int i = 0; i < n; i++) {
			arr[i] = new Time(Integer.parseInt(bf.readLine()), Integer.parseInt(bf.readLine()));
		}
		int count = 0;
		boolean[] line = new boolean[Integer.MAX_VALUE];
		Arrays.sort(arr, new Comparator<Time>() {
			@Override
			public int compare(Time o1, Time o2) {
				if (o1.diff < o2.diff) {
					return -2;
				} else if (o1.diff == o2.diff) {
					if (o1.start < o2.start) {
						return -1;
					} else if (o1.start == o2.start) {
						if (o1.end < o2.end) {
							return 2;
						}
					}
				}

				return 1;

			}

		});

		for (int i = 0; i < n; i++) {
			boolean flag = false;
			for (int j = arr[i].start; j < arr[i].end; j++) {
				if (line[j]) {
					flag = true;
					break;
				}
				line[j] = true;
			}
			if (!flag) {
				count++;
			}

		}
		 System.out.println(Arrays.toString(arr));
		System.out.println(count);
	}

	static class Time {
		int start;
		int end;
		int diff;

		public Time(int start, int end) {
			super();
			this.start = start;
			this.end = end;
			this.diff = end - start;
		}

		@Override
		public String toString() {
			return "Time [start=" + start + ", end=" + end + ", diff=" + diff + "]\n";
		}

	}

	static String aa = "11\r\n" + "1 4\r\n" + "3 5\r\n" + "0 6\r\n" + "5 7\r\n" + "3 8\r\n" + "5 9\r\n" + "6 10\r\n"
			+ "8 11\r\n" + "8 12\r\n" + "2 13\r\n" + "12 14";

}