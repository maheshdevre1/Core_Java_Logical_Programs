package StringProgram;

public class CountNumberOfWhiteSpaces {

	public static void main(String[] args) {
		String str = " java is opp  ";

		char ch[] = str.toCharArray();
		int count = 0;
		for (char one : ch) {
			if (one == ' ') {
				count++;
			}

		}
		System.out.println("Number of white spaces ==> "+count);
	}

}
