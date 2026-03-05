package StringProgram;

public class CountChracterInString {

	public static void main(String[] args) {
		String s = "java";

		char ch[] = s.toCharArray();
		int count = 0;
		for (char one : ch) {
			count++;
		}
		System.out.println("charcter in string ==> "+count);
	}

}
