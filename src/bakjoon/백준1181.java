package bakjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.*;

public class 백준1181 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());

		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			String temp = bf.readLine();
			if(!list.contains(temp))
				list.add(temp);
		}
		
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() > o2.length()) {
					return 1;
				} else 	if(o1.length() == o2.length()) {
					return o1.compareTo(o2);
				}
				return -1;
			}
		});
		
		for(String a : list) {
			System.out.println(a);
		}
		
		 
	}

}
