package NumberProgram;

public class CheckNumberIsAnagramOrNot {
     public static void main(String[] args) {
		int num = 121, rev = 0;
		int originalNum = num;

		while (num > 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}

		System.out.println(rev);

		if (rev == originalNum) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not anagram");
		}
	}

}
