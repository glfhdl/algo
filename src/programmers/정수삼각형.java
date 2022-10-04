package programmers;

import java.util.*;

public class 정수삼각형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = 0;

		int[][] triangle = { { 7 }, { 3, 8 }, { 8, 1, 0 }, { 2, 7, 4, 4 }, { 4, 5, 2, 6, 5 } };
		// 한칸 왼쪽 [i+1][j-1] j-1 < 0 ? j = 0
		// 한칸 오른쪽 [i+1][j+1] j+1 > i ? j = i
		int[][] temp = new int[triangle.length][];
		for (int i = 1; i < triangle.length; i++) {
			temp[i] = new int[i + 1];
			for (int j = 0; j < i+1; j++) {
				int left = j - 1;
				int right = j + 1;
				if (i - 1 == 0) {
					temp[i][j] = triangle[i][j];
				} else {
					if (left >= 0) { // i = 2
						temp[i][j] = triangle[i][j] + temp[i - 1][j - 1];
					}
					if (right < i ) {
						temp[i][j] = Math.max(temp[i - 1][j] + triangle[i][j], temp[i][j]);
					}
				}

			}
			System.out.println(Arrays.toString(temp[i]));
		}
		
		Arrays.sort(temp[triangle.length-1]);
		answer = triangle[0][0] + temp[triangle.length-1][triangle.length-1];
		System.out.println(answer);

	}

}
