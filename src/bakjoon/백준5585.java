package bakjoon;
import java.util.*;
public class 백준5585 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);
		
		int money = scanner.nextInt();
		int count = 0;
		int start = 1000 - money;
		int i = 0;
		int[] m = {500,100,50,10,5,1};
		while(money >= 0) {
			System.out.println(start);
			if(start - m[i] >= 0) {
				count++;
				start -= m[i];
			}else if(start - m[i] < 0){
				i++;
			}
				
			if( start == 0) {
				break;
			}
			
		}
		System.out.println();
		System.out.println(count);
	}
	static String aa = "380";
}
