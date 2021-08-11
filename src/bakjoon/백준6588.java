package bakjoon;

import java.util.Arrays;
import java.io.*;
import java.util.*;

public class 백준6588 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		String wrong = "Goldbach's conjecture is wrong.\n";
		boolean[] check = new boolean[1000001];
		check[0] = check[1] = true;

		for (int i = 2; i <= Math.sqrt(1000001); i++) {

			// 이미 체크된 배열이면 다음 반복문으로 skip
			if (!check[i]) {
				// i 의 배수들을 걸러주기 위한 반복문
				for (int j = i * i; j < check.length; j = j + i) {
					check[j] = true;

				}
			}
		}

		while (true) {
			int t = Integer.parseInt(br.readLine());
			if (t == 0) {
				break;
			}
			
			for (int i = 2; i <= Math.sqrt(t); i++) {

				// 이미 체크된 배열이면 다음 반복문으로 skip
				if (!check[i]) {
					// i 의 배수들을 걸러주기 위한 반복문
					for (int j = i * i; j < check.length; j = j + i) {
						check[j] = true;

					}
				}
			}

			LinkedList<Integer> list = new LinkedList();
			for (int i = 2; i <= t; i++) {
				if (!check[i]) {
					list.add(i);
				}
			}
			int a = 0;
			int b = 0;
			togo: for (int i = list.size() - 1; i >= 0; i--) {
				a = list.get(i);
				for (int j = 0; j < list.size(); j++) {
					if (a + list.get(j) == t) {
						b = list.get(j);
						sb.append(t + " = " + b + " + " + a + "\n");
						break togo;
					}
				}
			}
			if (b == 0) {
				sb.append(wrong);
			}
		}

		System.out.println(sb.toString());
	}

	static String aa = "8\r\n" + "20\r\n" + "42\r\n" + "0";
}
