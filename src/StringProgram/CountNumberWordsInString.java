package StringProgram;

public class CountNumberWordsInString {

	public static void main(String[] args) {
		String str = "java is opp ";
		String str1 = str.trim();
		char ch[] = str1.toCharArray();
		int count = 1;
		for (char one : ch) {
			if (one == ' ') {
				count++;
			}

		}
		System.out.println("count of words "+count);
	}

}
