package bakjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 백준14889 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		int n = scanner.nextInt();
		map = new int[n][n];
		result = Integer.MAX_VALUE;
		int[] order = new int[n];
		for (int i = 0; i < n; i++) {
			order[i] = i;
			for (int j = 0; j < n; j++) {
				map[i][j] = scanner.nextInt();
			}
		}
		list = new ArrayList();
		// permutation(order, n, 0, new int[n], 0);
		combi(order, n / 2, 0, new int[n]);
		for (int i = 0; i < list.size() / 2; i++) {
			cal(list.get(i), list.get(list.size() - 1 - i));
		}
		  System.out.println(result);
	}

	// 순열
	static int[][] map;
	static int aSum;
	static int bSum;
	static boolean check;
	static int result;

	static void cal(int[] a, int[] b) { 
		aSum = bSum = 0;
		if (a.length == 2) {
			aSum = map[a[0]][a[1]] +  map[a[1]][a[0]];
			bSum = map[b[0]][b[1]] + map[b[1]][b[0]]; 
		} else {
			check = false; // a진행중인지 체크하는것

			combi1(a, 2, 0, new int[a.length]);
			check = true; 
			combi1(b, 2, 0, new int[a.length]);
			check = false; // a진행중인지 체크하는것

		} 
		 
		result = Math.min(result, Math.abs(aSum - bSum));
	}

	static void combi1(int[] src, int r, int i, int[] temp) {
		if (r == 0) {
			int a = src.length - 2;
			int b = a-1;
			if (!check)
				aSum += map[temp[a]][temp[b]] + map[temp[b]][temp[a]];
			else
				bSum += map[temp[a]][temp[b]]+ map[temp[b]][temp[a]];
			 
			 
			  
			return;
		} else if (i == src.length) {
			return;
		} else {
			temp[src.length - 1 - r] = src[i];
			combi1(src, r - 1, i + 1, temp);
			combi1(src, r, i + 1, temp);
		}

	}

	static ArrayList<int[]> list;

	static void combi(int[] src, int r, int i, int[] temp) {
		if (r == 0) {
			int[] result = new int[src.length / 2];
			int t = 0;
			for (int j = src.length - 2; j >= src.length / 2 - 1; j--) {
				// System.out.print(temp[j]+" ");
				result[t] = temp[j];
				t++;
			} // System.out.println();
			list.add(result);
			// System.out.println(Arrays.toString(temp));
			return;
		} else if (i == src.length) {

			return;

		} else {

			temp[src.length - 1 - r] = src[i];
			combi(src, r - 1, i + 1, temp);
			combi(src, r, i + 1, temp);
		}

	}

	static String aa = "6\r\n" + 
			"0 84 1 1 1 1\r\n" + 
			"84 0 1 1 1 1\r\n" + 
			"1 1 0 8 100 4\r\n" + 
			"1 1 1 0 7 4\r\n" + 
			"1 1 3 10 0 4\r\n" + 
			"1 1 11 2 14 0";
}
