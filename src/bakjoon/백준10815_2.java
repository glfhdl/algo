package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 백준10815_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int[] arr = new int[n];/* 찾고자 하는 원소들 */ // 꼭 정렬되어있어야한다. 

		String[] tt = bf.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(tt[i]);
		}
		

		Arrays.sort(arr);
		int m = Integer.parseInt(bf.readLine()); 

		String[] ttt = bf.readLine().split(" ");
		for (int i = 0; i < m; i++) {
			 binarySearch(arr, Integer.parseInt(ttt[i]));
		}
		
		 
		
	}

	private static void binarySearch(int[] arr, int key) {

		/* 배열의 첫번째 인덱스 값 */
		int left = 0;

		/* 배열이라서 -1함 */
		int right = arr.length - 1;
		int mid;

		while (left <= right) {

			/* 중앙값을 계산한다 */
			mid = (left + right) / 2;

			if (key == arr[mid]) {
				System.out.print(1 + " ");
				return;
			}

			/* 찾고자 하는 KEY값이 배열의 중앙값보다 작을경우 */
			if (key < arr[mid]) {

				/* 데이터는 왼쪽에 위치함으로 right를 mid에서 1을 뺀 값으로 변경 */
				right = mid - 1;
			}

			/* 찾고자 하는 KEY값이 배열의 중앙값보다 클 경우 */
			else {

				/* 데이터는 오른쪽에 위치함으로 left값을 mid에서 1을 더한 값으로 변경 */
				left = mid + 1;
			}
		}
		
		System.out.print(0 + " ");
		return;
	}

}
