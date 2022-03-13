package programmers;

import java.util.*;
import java.text.*;

public class 추석트래픽 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		// 1552 start 1630
		// 0407 start 0457
		String[] lines = { "2016-09-15 20:59:57.421 0.351s", "2016-09-15 20:59:58.233 1.181s",
				"2016-09-15 20:59:58.299 0.8s", "2016-09-15 20:59:58.688 1.041s", "2016-09-15 20:59:59.591 1.412s",
				"2016-09-15 21:00:00.464 1.466s", "2016-09-15 21:00:00.741 1.581s", "2016-09-15 21:00:00.748 2.31s",
				"2016-09-15 21:00:00.966 0.381s", "2016-09-15 21:00:02.066 2.62s" };

		int max = -1;

		// 현재시간 Date
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss.SSS", Locale.KOREA);

		// 요청시간을 Date로 parsing 후 time가져오기

		for (int i = 0; i < lines.length - 1; i++) {
			Date reqDate = formatter.parse(lines[i].split(" ")[1]);
			double reqDateTime = reqDate.getTime();
			double startT = Double
					.parseDouble(lines[i].split(" ")[2].substring(0, lines[i].split(" ")[2].length() - 1));
			int check = 1;
			double starTime1 = reqDate.getTime() - startT * 1000 + 1;
			// 1의 종료~2의 시작
			for (int j = i + 1; j < lines.length; j++) {
				double t = Double.parseDouble(lines[j].split(" ")[2].substring(0, lines[j].split(" ")[2].length() - 1));
				Date reqDate1 = formatter.parse(lines[j].split(" ")[1]);
				double reqDateTime1 = reqDate1.getTime() - t * 1000 + 1;

				System.out.println(t + ", " + reqDateTime + " , " + reqDateTime1);
				if(Math.abs( reqDateTime - reqDateTime1  ) <  1000.0 || starTime1 - reqDateTime1 >= 0 || reqDateTime - reqDateTime1 >= 0) {

					check++;
				}
				System.out.println(lines[i] + ", " + (reqDateTime1 - reqDateTime));
				// System.out.println(starTime1 - reqDateTime1);
				// System.out.println(reqDateTime + " , " + reqDateTime1);

			}
			System.out.println();

			max = Math.max(max, check);

		}

		System.out.println(max);
	}

}
