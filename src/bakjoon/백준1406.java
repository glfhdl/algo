package bakjoon;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class 백준1406 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		sb.append(bf.readLine());
		int idx = sb.length();
		int n = Integer.parseInt(bf.readLine());

		for (int i = 0; i < n; i++) {
			String temp = bf.readLine();
			if (temp.equals("L")) {
				if (idx != 0) {
					idx--;
				}

			} else if (temp.equals("D")) {
				if (idx != sb.length()) {
					idx++;
				}

			} else if (temp.equals("B")) {
				//System.out.println(sb.charAt(idx));
				if (idx != 0) {
					sb.deleteCharAt(idx - 1);
					idx--;
				}

			} else {
				String[] t = temp.split(" ");
				// System.out.println(idx +" " +sb.toString());
				// System.out.println(sb.charAt(idx-1) + " " + t[0]);
				sb.insert(idx, t[1]);
				idx++;

			}
		}

		System.out.println(sb.toString());
	}

	static String aa = "abcd\r\n" + "3\r\n" + "P x\r\n" + "L\r\n" + "P y";

}
