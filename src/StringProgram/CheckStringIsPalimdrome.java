package StringProgram;

public class CheckStringIsPalimdrome {
	public static void main(String[] args) {
		String str = "121";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (rev.equals(str)) {
			System.out.println("Given string is palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}
}
