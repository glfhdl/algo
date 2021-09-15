package programmers;

import java.util.*;

public class 로또의최고순위와최저순위 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 6:09 시작
		// 6:21 끝
		// 12분 걸림
		int[] lottos = { 44, 1, 0, 0, 31, 25 };
		int[] win_nums = { 31, 10, 45, 1, 6, 19 };

		int[] lotto = new int[46];

		int zero = 0;
		for (int i = 0; i < 6; i++) {
			if (lottos[i] == 0) {
				zero++;
			}
			lotto[lottos[i]]++;
			lotto[win_nums[i]]++;
		}

		int count = 0;
		for (int i = 1; i < 46; i++) {
			if (lotto[i] == 2) {
				count++;
			}
		}
 
		System.out.println(rank(count+zero) + " " + rank(count));

		// 최고 최저순위

	}

	static int rank(int val) {
		switch (val) {
			case 6: {
				return 1;
			}
			case 5: {
	
				return 2;
			}
			case 4: {
	
				return 3;
			}
			case 3: {
				return 4;
			}
			case 2: {
				return 5;
			}
		}
		return 6;
	}

}
