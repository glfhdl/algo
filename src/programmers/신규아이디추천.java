package programmers;

public class 신규아이디추천 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 6:30 시작 700 749 759 끝
		// 총 40분 걸림
		String new_id = "abcdefghijklmn.p";

		StringBuilder sb = new StringBuilder();
		// 1.모두 소문자로

		// 2.알파벳 소문자, 숫자, 빼기, 밑줄, 마침표 제외한 모든 문자 제거
		String one = new_id.toLowerCase();
		for (int i = 0; i < one.length(); i++) {
			if ((one.charAt(i) >= 97 && one.charAt(i) <= 122) || (one.charAt(i) >= 48 && one.charAt(i) <= 57) ||one.charAt(i) == '-' || one.charAt(i) == '_'
					|| one.charAt(i) == '.') {
				sb.append(one.charAt(i));
			}
		}

		// ..는 .로 치환
		String two = sb.toString();
		//System.out.println("?? " + two);
		sb = new StringBuilder();
		sb.append(two.charAt(0));
		for (int i = 1; i < two.length(); i++) {
			if (two.charAt(i) == '.') {
				if (sb.toString().charAt(sb.length() - 1) != '.') {
					sb.append(two.charAt(i));
				}
			} else {
				sb.append(two.charAt(i));
			}
		}
		//System.out.println(sb.toString());

		// 처음이나 끝의 마침표 제거

		if (sb.length() != 0 && sb.charAt(0) == '.') {
			sb.deleteCharAt(0);
		}
		// System.out.println(sb.toString());
		if (sb.length() != 0 && sb.charAt(sb.length() - 1) == '.') {
			sb.deleteCharAt(sb.length() - 1);
		}

		// 빈 문자열이면 a 대입

		if (sb.length() == 0) {
			sb.append("a");
		}

		if (sb.length() >= 16) {
			sb.delete(15, sb.length());
			// System.out.println(sb.toString() );
			if (sb.charAt(sb.length() - 1) == '.') {
				sb.deleteCharAt(sb.length() - 1);
			}
		}

		if (sb.length() <= 2) {
			char temp = sb.charAt(sb.length() - 1);
			while (sb.length() != 3) {
				sb.append(temp);
			}

		}

		System.out.println(sb.toString());

	}

}
