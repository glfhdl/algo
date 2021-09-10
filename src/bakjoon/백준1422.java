package bakjoon;

import java.io.*;
import java.util.*;
 

public class 백준1422 {

	public static class MyScanner {
		BufferedReader bf;
		StringTokenizer st;

		MyScanner() {
			bf = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(bf.readLine());
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

	}

	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
		int K = sc.nextInt();
		int N = sc.nextInt();
		ArrayList<String> arr = new ArrayList<String>();
		ArrayList<String> ans = new ArrayList<String>();

		for (int i = 0; i < K; i++) {
			arr.add(sc.next());
			ans.add(arr.get(i));
		}

		Collections.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1.length() != o2.length())
					return o1.length() - o2.length();
				else
					return o1.compareTo(o2);
			}

		});

		for (int i = 0; i < N - K; i++) {
			ans.add(arr.get(K - 1));
		}

		Collections.sort(ans, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

				return o1.concat(o2).compareTo(o2.concat(o1));
			}

		});

		System.out.println(arr.toString());
		System.out.println();
		System.out.println(ans.toString());

		for (int i = N - 1; i >= 0; i--) {
			System.out.print(ans.get(i));
		}

	}
	static ArrayList<Long> list;

	static void perm(long[] arr, long[] output, boolean[] visited, long depth, long n, long r) {
		if (depth == r) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < n; i++) {
				sb.append(output[i]);
			}
			list.add(Long.parseLong(sb.toString()));
			return;
		}

		for (long i = 0; i < n; i++) {
			if (visited[(int) i] != true) {
				visited[(int) i] = true;
				output[(int) depth] = arr[(int) i];
				perm(arr, output, visited, depth + 1, n, r);
				visited[(int) i] = false;
			}
		}
	}

	static String aa = "3 4\r\n" + "\r\n" + "1004\r\n" + "\r\n" + "100\r\n" + "\r\n" + "10";
}
