package bakjoon;
import java.util.Scanner;

public class 백준5014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		int total = scanner.nextInt();
		int now = scanner.nextInt();
		int togo = scanner.nextInt();
		int up = scanner.nextInt();
		int down = scanner.nextInt();

		int count = 0;
		while (true) {
			if (now == togo) {
				System.out.println(count); 
				break;
				
			} 
			
			if(up == 0) {
				if (now - down >= 0) { 
					now = now - down;
					count++;
				//	System.out.println("down, now:" + now + " ,count:" + count);
				}
				else
				{
					System.out.println("use the stairs");
					break;
				}
			}
			
			if(down == 0) {
				if (now + up <= togo) {
					now += up;
					count++;
				//	System.out.println("up, now:" + now + " ,count:" + count);
				} else {
					System.out.println("use the stairs");
					break;
					
				}
			}

			if (now + up <= togo) {
				now += up;
				count++;
			//	System.out.println("up, now:" + now + " ,count:" + count);
			} else { 
				if (now - down >= 0) { 
					now = now - down;
					count++;
				//	System.out.println("down, now:" + now + " ,count:" + count);
				}
				else
				{
					System.out.println("use the stairs");
					break;
				}
			}

		}
		 

	}

	static String aa = "100 2 1 1 0";

}
