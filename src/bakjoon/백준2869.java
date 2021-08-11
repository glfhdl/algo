package bakjoon;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class 백준2869 {


	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] t = br.readLine().split(" ");
        
		int up = Integer.parseInt(t[0]);
		int down = Integer.parseInt(t[1]);
		int length = Integer.parseInt(t[2]);
 
		int day = (length - down) / (up - down);
		if ((length - down) % (up - down) != 0)
			day++;
 
		System.out.println(day);
	}

	static String aa = "2 1 5";

}
