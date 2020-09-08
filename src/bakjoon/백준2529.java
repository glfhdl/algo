package bakjoon;

import java.util.Arrays;
import java.util.Scanner;

public class 백준2529 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		int n = scanner.nextInt();

		String[] array = new String[n];
		for (int i = 0; i < n; i++) {
			array[i] = scanner.next();
		}
		int[] min = new int[n + 1];
		int[] max = new int[n + 1];
		boolean[] checkMin = new boolean[10];
		boolean[] checkMax = new boolean[10];

		if (array[0].equals("<")) {
			min[0] = 0;
			max[0] = 8;
			checkMax[8] = true;
			checkMin[0] = true;

		}
		if (array[0].equals(">")) {
			min[0] = 1;
			max[0] = 9;
			checkMax[9] = true;
			checkMin[1] = true;
		}

		boolean pickedMin = false;
		boolean pickedMax = false;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= 9; j++) { 
				if (array[i].equals("<")) {
					if (min[i] < j && !checkMin[j]) {
						if (min[i + 1] == 0)
							min[i + 1] = j;
						else
							min[i + 1] = Math.min(min[i + 1], j);

						pickedMin = true;
					}
					if (max[i] < j && !checkMax[j]) { 
						max[i + 1] = Math.max(min[i+1], j);
						pickedMax = true;
					}
				}
				if (array[i].equals(">")) {
					if (min[i] > j && !checkMin[j]) {
						if (min[i + 1] == 0)
							min[i + 1] = j;
						else
							min[i + 1] = Math.min(min[i + 1], j);

						pickedMin = true;
					}
					if (max[i] > j && !checkMax[j]) {
						max[i + 1] = Math.max(min[i+1], j);
						pickedMax = true;
					}
				}
				//System.out.println(Arrays.toString(max));
				//System.out.println(Arrays.toString(checkMax));
			}
			if (!pickedMin) {
				//System.out.println("안됐어Min");
				while(true) {
					if(!checkMin[min[i]]) {
						break;
					}
					checkMin[i] = false;
					min[i]--; 
				}
				i++;
				checkMin[min[i]] = true;
			 
			} else if (!pickedMax) {
				//System.out.println("안됐어Max");
				System.out.println(i  + "!");
				int count = 0;
				int temp = max[i];
				while(true) {
					if(!checkMax[temp]) {
						break;
					}
					count++;
					checkMax[temp] = false;
					temp--; 
					System.out.println(temp + " , " + i + " , " + count);
				}
				i = i - count + 1;
				max[i] = temp;
				checkMax[max[i]] = true;
				
			} else {

				checkMax[max[i + 1]] = true;
				checkMin[min[i + 1]] = true;
				pickedMin = false;
				pickedMax = false;
			}

		}
 
		
		for(int a : max) {
			System.out.print(a);
		}
		System.out.println();
		for(int a : min) {
			System.out.print(a);
		}
	}

	static void is() {

	}

	static String aa = "5\r\n" + 
			"\r\n" + 
			"< < < > <";

}
