package programmers;

import java.util.*;

public class 문자열압축2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1450 start
		// 1550 end
		String s = "aaaaaaaaaab";

		ArrayList<String> list = new ArrayList();
		ArrayList<Integer> list1 = new ArrayList();

	 
		for(int i = 1; i <= s.length(); i++) { 
				int n = 1; 
				String t = "";
				for(int j = 0; j <  s.length() ; j += i) { 
					//System.out.println(i + ", " + (j+i+i) + ", " + s.substring(j) + ", " + t);
					if(j+i+i >    s.length()  ) {
						
						if(n == 1) {
							t += s.substring(j); 
						}else {
							t += Integer.toString(n)+s.substring(j);
						} 
						break;
					}
					
					if(s.substring(j, j+i).equals(s.substring(j+i, j+i+i))) {
						n++;
					}else {
						if(n == 1) {
							t += s.substring(j, j+i); 
						}else {
							t += Integer.toString(n)+s.substring(j, j+i);
						}
						n = 1;
					}
					
				}
				//	System.out.println(i + ", " +  t);
				list.add(t);
				list1.add(t.length());
			 
		}
		Collections.sort(list1);
		System.out.println(list.toString()); 
		System.out.println(list1.toString()); 

	}

}
