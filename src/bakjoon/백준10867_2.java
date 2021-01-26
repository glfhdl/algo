package bakjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class 백준10867_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);
		int n = scanner.nextInt();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < n; i++) {
			map.put(scanner.nextInt(), 1);
		}
		ArrayList<Integer> list = new ArrayList(map.keySet());
		Collections.sort(list);
		for(int a : list)
			System.out.print(a + " ");
		

	}
	static String aa = "10\r\n" + 
			"1 4 2 3 1 4 2 3 1 2";

}
