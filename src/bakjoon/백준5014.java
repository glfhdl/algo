package bakjoon;
import java.util.Scanner;

public class 백준5014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);
//0650 start
		int total = scanner.nextInt();
		int now = scanner.nextInt();
		int togo = scanner.nextInt();
		int up = scanner.nextInt();
		int down = scanner.nextInt();
//10 1 10 2 1
		
		int count = 0;
		boolean[] visited = new boolean[total+1];
		
		while (true) {
			
			visited[now] = true;
			
			if (now == togo) {
				System.out.println(count); 
				break;
				
			} 
			 
			if(now < togo) {
				if(now + up > total) { 
					now -= down;
				}else {
					now += up;
				}
				
				if(!visited[now]) {
					count++;
				}else {
					System.out.println("use the stairs");
					break;
				}
				
			}
			
			if(now > togo) { 
				if(now - down < 1) { 
					now += up;
					if(now > total) {
						System.out.println("use the stairs");
						break;
					}
				}else {
					now -= down;
				}
				
				if(!visited[now]) {
					count++;
				}else {
					System.out.println("use the stairs");
					break;
				}
				
			}
			
	 

		}
		 

	}

	static String aa = "100 100 1 1 100";

}
