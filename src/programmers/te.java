package programmers;

public class te {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

		String aa = "[[1, 1, 1, 0], [1, 1, 1, 0], [0, 0, 0, 1], [0, 0, 0, 1], [0, 0, 0, 1], [0, 0, 0, 1]]";

		aa.replace("[", "{");
		aa.replace("]", "}");

		System.out.println(aa.replace("[", "{").replace("]", "}"));
	}

}
