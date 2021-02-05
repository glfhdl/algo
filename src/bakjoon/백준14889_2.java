package bakjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 백준14889_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);
		
		int n = scanner.nextInt();
		map = new int[n][n];
		int[] src = new int[n];
		for(int i = 0; i < n; i++) {
			src[i] = i;
			for(int j = 0; j < n; j++) {
				map[i][j] = scanner.nextInt();
			}
		}
		list = new ArrayList<Integer>();
		makeCombi(src, n/2, 0, new int[n]);
		 

	}
	static ArrayList<Integer> list;
	static void makeCombi (int[] src, int r, int i, int[] temp) {
		if(r == 0) { 
			for (int t = src.length - 2; t > src.length*0.5 -2  ; t--) { 
				System.out.print(temp[t] + " ");
			}
			System.out.println();
		//	System.out.println("조합 " + Arrays.toString(temp)); 
			return;
		}else if( i == src.length) {
			return;
		}else {
			temp[src.length -1 -r] = src[i];
			makeCombi(src, r-1, i+1, temp);
			makeCombi(src, r, i+1, temp);
		}
	}
	static int[][] map;
	static String aa="4\r\n" + 
			"0 1 2 3\r\n" + 
			"4 0 5 6\r\n" + 
			"7 1 0 2\r\n" + 
			"3 4 5 0";

}
