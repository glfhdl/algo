package bakjoon;
import java.util.*;
public class 백준20044 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//한팀에 두명
		
		Scanner scanner = new Scanner (System.in);
		scanner = new Scanner (aa);
		
		int n = scanner.nextInt();
		String nums = scanner.nextLine();
		nums = scanner.nextLine();
		String[] t = nums.split(" ");
		int[] arr = new int[t.length];
		
		for(int i = 0; i < t.length; i++) {
			arr[i] = Integer.parseInt(t[i]);
		}
		//System.out.println(nums + "  " + Arrays.toString(t));
		Arrays.sort(arr);
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length/2; i++) {
			min = Math.min(min, arr[i] + arr[t.length-i-1]);
		}
		System.out.println(min);
				
	}
	static String aa = "3\r\n"
			+ "1 7 3 5 9 2";
}
