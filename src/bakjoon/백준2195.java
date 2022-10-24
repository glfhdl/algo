package bakjoon;
import java.util.Scanner;

public class 백준2195 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);
		
		String one = scanner.next();
		String won = scanner.next();
		
		int count = 0; 
		for(int i = one.length() - 1; i >= 0; i--) {
			String t = one.substring(0, i);
			int a = won.length();
			won.replaceAll(t, "");
			int b = won.length();
			System.out.println(t + " " + a + " " + b+ " " +(i+1));
			count += (a-b)/(i+1);
		}
		System.out.println(count);
	}
	static String aa = "xy0z\r\n"
			+ "zzz0yyy0xxx";
}
