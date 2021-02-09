package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class 백준11650_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());

		XY[] list = new XY[n];
		for (int i = 0; i < n; i++) {
			String[] t = bf.readLine().split(" ");
			list[i] = new XY(Integer.parseInt(t[0]), Integer.parseInt(t[1]));

		}

		Arrays.sort(list, new Comparator<XY>() {

			@Override
			public int compare(XY o1, XY o2) {
				// TODO Auto-generated method stub
				if (o1.x > o2.x) {

					return 1;

				} else if (o1.x == o2.x) {
					if (o1.y > o2.y) {
						return 1;
					}

				}  
				return -1;

			}
		});
		for (XY aa : list)
			System.out.println(aa.toString());
	}

	static class XY {
		int x;
		int y;

		public XY(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return x + " " + y;
		}

	}

}
