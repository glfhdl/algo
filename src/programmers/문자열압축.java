package programmers;

import java.util.*;

public class 문자열압축 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1007 start
		String s = "abcabcabcabcdededededede";

		ArrayList<Integer> list = new ArrayList();

		// 한개씩은 따로 계산
		int c = 1;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				c++;

			} else {
				if (c > 1) {
					sb.append(c);
				}
				sb.append(s.charAt(i));
				c = 1;
			}

			if (i + 1 == s.length() - 1) {
				if (c > 1) {
					sb.append(c);
				}
				sb.append(s.charAt(i));
			}

		}
		list.add(sb.toString().length());

		// substring
		for (int i = 2; i <= s.length() / 2; i++) {
			String t = s.substring(0, i);
			System.out.println(t);
			// count, len = i
			int count = 0;
			int k = 0;
			for (int j = i; j <= s.length(); j += i) {
				if (i + j > s.length()) {
					if (count > 0) {
						System.out.println();
						System.out.println(
								s.substring(0, k - i) + " / " + s.substring(k - i, k) + " / " + s.substring(j));

						System.out.println();
						String a = s.substring(0, k - i) + Integer.toString(count + 1) + s.substring(k - i, k)
								+ s.substring(j);
						System.out.println();
						System.out.println("삽입되는것!! " + a );
						System.out.println();
						list.add(a.length());
						count = 0;
					}
					break;
				}
				System.out.println(t + "!! " + s.substring(j, j + i));
				if (t.equals(s.substring(j, j + i))) {
					count++;
					if (count == 1) {
						k = j;
					}
					// System.out.println("맞음");
					// System.out.println(t + " ?? " + s.substring(j, j+i));

				} else {
					if (count > 0) {
						System.out.println();
						System.out.println(
								s.substring(0, k - i) + " / " + s.substring(k - i, k) + " / " + s.substring(j));

						System.out.println();
						String a = s.substring(0, k - i) + Integer.toString(count + 1) + s.substring(k - i, k)
								+ s.substring(j);
						System.out.println();
						System.out.println("삽입되는것** " + a );
						System.out.println();
						list.add(a.length());
						count = 0;
					}
				}
				t = s.substring(j, j + i);
			}
		}
		System.out.println();

		Collections.sort(list);
		System.out.println(list.toString());

	}

}
