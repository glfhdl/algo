package bakjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class 백준14725 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		int total = scanner.nextInt();
		ArrayList<String> array[] = new ArrayList[total];
		ArrayList<String> result = new ArrayList<String>();
		int n = 0;
		for (int i = 0; i < total; i++) {
			n = scanner.nextInt();
			array[i] = new ArrayList<String>();
			for (int j = 0; j < n; j++) {
				String t = scanner.next();
				array[i].add(t);
			 
				
			}
		}

	 
		Arrays.sort(array, new Comparator<ArrayList<String>>() {

			@Override
			public int compare(ArrayList<String> o1, ArrayList<String> o2) {
				// TODO Auto-generated method stub
				if (o1.get(0).charAt(0) >= o2.get(0).charAt(0)) {
					return 0;
				}
				return -1;
			}

		});
		
		for (int i = 0; i < total; i++) {
			//System.out.println(array[i].toString());
			for (int j = 0; j < array[i].size(); j++) {
				String t = array[i].get(j); 
				 
				String floor = "";
				if(j != 0) {
					for(int k = 0; k < j; k++) {
						floor += "--" ;
					}
					t = floor + t;
					int idx = result.indexOf(array[i].get(0));//n번째 --안붙은 처음 시작
			
					boolean flag = false;
					boolean isIn = false;
					
					List<String> temp = result.subList(idx, result.size());
					if(temp.contains(t)) {
						isIn = true;
					}
					for(int k =idx; k < result.size(); k++) {
						
						if(result.get(k).contains(floor) && !isIn) { 
							if(result.get(k).charAt((j)*2) > t.charAt((j)*2)) {
								result.add(k, t);
							 
								flag = true;
								break;
							}
						}
					}
					
					if(!flag  && !isIn) {
						result.add( t);
					}
				} 
				
				if( !result.contains(t) && j == 0 ) {
					result.add(t);
				}  
				
			}
		}
		
		for (int i = 0; i < result.size(); i++) {
			 
			System.out.println(result.get(i));
			 
		}
		
	}

	static String aa = "4\r\n" + 
			"2 KIWI BANANA\r\n" + 
			"2 KIWI APPLE\r\n" + 
			"2 APPLE APPLE\r\n" + 
			"3 APPLE BANANA KIWI";

}
