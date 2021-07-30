package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 백준10816 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(bf.readLine());
		HashMap<Integer, Integer> map = new HashMap();
		String[] a = bf.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			int t = Integer.parseInt(a[i]);
			if (map.containsKey(t))
				map.put(t, map.get(t) + 1);
			else {
				map.put(t, 1);
			}

		}
		int m = Integer.parseInt(bf.readLine());
		String[] b = bf.readLine().split(" ");
		for (int i = 0; i < m; i++) {
			int t = Integer.parseInt(b[i]);

			if (map.containsKey(t))
				sb.append(map.get(t) + " ");
			else {
				sb.append(0 + " ");
			}

		}
		System.out.println(sb.toString());
	}

}
