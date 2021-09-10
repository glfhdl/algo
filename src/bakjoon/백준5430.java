package bakjoon;

import java.io.*;
import java.util.*;
 
public class 백준5430 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int tc = Integer.parseInt(bf.readLine());

		StringBuilder sb = new StringBuilder();
		for (int t = 0; t < tc; t++) {
			String order = bf.readLine();
			int n = Integer.parseInt(bf.readLine());
 

			String numbers = bf.readLine();
			numbers = numbers.substring(1, numbers.length() - 1);
			if (numbers.length() != 0) {
				String[] nums = numbers.split(",");
				// System.out.println(numbers);

				StringBuffer arr = new StringBuffer();
				for (int j = 0; j < nums.length; j++) {
					arr.append(nums[j]);
				}
 
				for (int j = 0; j < order.length(); j++) {
					if (order.charAt(j) == 'R') {
						arr = arr.reverse();
					} else { 
						if (arr.length() != 0) {
							arr.deleteCharAt(0);
						} else { 
							break;
						}
					}
				}
			//	System.out.println(arr.length());
				if (arr.length() != 0) {
					sb.append("[");
					sb.append(arr.charAt(0));
					for(int j =1; j < arr.length(); j++) {
						sb.append("," + arr.charAt(j)  );
					}
					//sb.append(arr.charAt(arr.length()));  
					 
					sb.append("]\n");
				}
				else {
					sb.append("error\n");
				}
			} else {
				sb.append("error\n"); 

			}
		}
		
		System.out.println(sb.toString());

	}

	static String aa = "4\r\n" + "RDD\r\n" + "4\r\n" + "[1,2,3,4]\r\n" + "DD\r\n" + "1\r\n" + "[42]\r\n" + "RRD\r\n"
			+ "6\r\n" + "[1,1,2,3,5,8]\r\n" + "D\r\n" + "0\r\n" + "[]";

}
