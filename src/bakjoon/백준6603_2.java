 

package bakjoon; 

import java.util.Scanner;

public class 백준6603_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		 
		while (true) {
			int t = scanner.nextInt();
			if (t == 0)
				break;

			int[] array = new int[t];
			for (int i = 0; i < t; i++) {
				array[i] = scanner.nextInt();
			}
			int[] temp = new int[t];
			makeCombination(array, 6, 0, temp);
			System.out.println();
		}

	}

	private static void makeCombination(int[] src, int r, int i, int[] temp) {
		if (r == 0) {
			for(int t = 0;t < src.length; t++) {
				if(temp[t] != 0)
					System.out.print(temp[t] + " ");
			}System.out.println(); 
			return;
		} else if (i == src.length) {
			return;
		} else {
			temp[src.length - 1 - r] = src[i];
			makeCombination(src, r - 1, i + 1, temp); // 요소를 선택했을 때
			makeCombination(src, r, i + 1, temp); // 요소를 선택하지 않았을 때
		}
	}

	static String aa = "7 1 2 3 4 5 6 7\r\n" + "8 1 2 3 5 8 13 21 34\r\n" + "0";

}
