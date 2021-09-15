package programmers;

public class 카카오인턴키패드누르기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 805
		// 835 중단
		// 1,4,7 왼손
		// 3,6,9 오른손
		// 2,5,8,0 가까운, 거리 같으면 오른손잡이는 오른손, 왼손잡이는 왼손
		// 처음 왼손 엄지손가락은 * -1 키패드에 오른손 엄지손가락은 # -2

		int[] numbers = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };
		String hand = "right";
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < numbers.length; i++) {
			switch (numbers[i]) {
			case 1: {
				sb.append("L");
				break;
			}
			case 2: {
				if (i == 0) {
					sb.append(finger(new Location(-1), numbers[i], hand));
				} else {
					sb.append(finger(new Location(-2), numbers[i], hand));
				}
				break;
			}
			case 3: {
				sb.append("R");
				break;
			}
			case 4: {
				sb.append("L");
				break;
			}
			case 5: {
				sb.append("L");
				break;
			}
			case 6: {
				sb.append("R");
				break;
			}
			case 7: {
				sb.append("L");
				break;
			}
			case 8: {
				sb.append("L");
				break;
			}
			case 9: {
				sb.append("R");
				break;
			}
			case 0: {
				sb.append("L");
				break;
			}
			}

		}
	}

	static class Location {
		int x;
		int y;

		public Location(int n) {
			super();
			switch (n) {
			case -2: {
				x = 4;
				y = 3;
				break;
			}
			case -1: {
				break;
			}
			case 1: {
				break;
			}
			case 2: {
				break;
			}
			case 3: {
				break;
			}
			case 4: {
				break;
			}
			case 5: {
				break;
			}
			case 6: {
				break;
			}
			case 7: {
				break;
			}
			case 8: {
				break;
			}
			case 9: {
				break;
			}
			case 0: {
				break;
			}
			}
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return "Location [x=" + x + ", y=" + y + "]";
		}
	}

	static String finger(Location before, int now, String hand) {

		return "L";
	}

}
