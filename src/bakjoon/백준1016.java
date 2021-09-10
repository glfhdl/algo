package bakjoon;

import java.util.Arrays;
import java.util.*;

public class 백준1016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner = new Scanner(aa);

		long min = scanner.nextLong(); // 갖고있는 랜선 개수 k
		long max = scanner.nextLong(); // 필요한 랜선 개수 n

		long count = max - min + 1;
		// 제곱수는 4 9 16 25

		// 로그 n으로 가려면

		// max 전까지의 제곱수를 다 구해라
		 

		// max 전까지의 제곱수의 배수를 다 구해라
		boolean[] cache = new boolean[(int)(max - min + 1)];
		long multipleCount = 0;
		for (long i = 2; i * i <= max; i += 1) {
			long power= i*i;
			long start = min % power == 0 ? min / power : (min / power) + 1;
            for(long j = start; power * j <= max; j++){
                cache[(int)((j * power) - min)] = true;
            }
		}
		for(int i = 0; i <= max - min; i++){
            if(!cache[i]){
            	multipleCount++;
            }
        }
		// 위의 수를 다 빼라
		System.out.println(  multipleCount);

	}

	static String aa = "1\r\n"
			+ "500";
}
