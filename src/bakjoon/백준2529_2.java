package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class 백준2529_2 {

	public static void main(String[] args) throws  IOException{
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String[] signs = bf.readLine().split(" "); 
		
		makeCombi(src, signs.length+1, 0, new int[signs.length+1]);
		
		for(int[] a : list) {
			System.out.println("순열 결과 " + Arrays.toString(a));
		}

	}
	static ArrayList<int[]> list;
	static int[] src = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }; 
	static int[] src_permu;
	//sings.len +1 개의 조합을 만들어낸다
	
	static void makeCombi (int[] src, int r, int i, int[] temp) {
		if(r == 0) {
			System.out.println("조합 " + Arrays.toString(temp));
			src_permu = new int[src.length];
			makePermu(src_permu.length, 0,  new int[src_permu.length], 0);
			return;
		}else if( i == src.length) {
			return;
		}else {
			temp[src.length -1 -r] = src[i];
			makeCombi(src, r-1, i+1, temp);
			makeCombi(src, r, i+1, temp);
		}
	}
	
	static void makePermu (int r, int current, int[] temp, int visited) {
		if (r == current) {
			//System.out.println("순열  " + Arrays.toString(temp));
			list.add(temp);
		}else {
			for(int i = 0; i < src_permu.length; i++) {
				temp[current] = src_permu[i];
				makePermu(r, current+1, temp, visited | (1 << i));
			}
		}
	}
	

}
