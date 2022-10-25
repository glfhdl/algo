package bakjoon;

import java.util.*;

public class 백준2331 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);
		
		int a = scanner.nextInt();
		int start = a;
		int n = scanner.nextInt();
		int max = (int)Math.pow(9,5)*4+1;
		boolean[] c = new boolean[max];
		c[a] = true;
		ArrayList<Integer> list = new ArrayList();
		list.add(a);
		int m = 0;
		while(true) {
			int b = a; 
			int t = 0;
			while(b != 0) {
				
				t += (int)Math.pow(b % 10,n); 
				b /= 10;
			} 
			if(c[t]) {
				m = list.indexOf(t);
				break;
			}
			else {
				c[t] = true;
				a = t;
				list.add(a);
			}
		}
		
		if(list.size() == 1) {
			if(list.get(0) == start) {
				System.out.println(0);
			}
		}else {
			//System.out.println(list.toString());
			System.out.println(m);
		}
	}
	static String aa = "57 2";

}
