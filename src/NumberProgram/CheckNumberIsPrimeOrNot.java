package NumberProgram;

public class CheckNumberIsPrimeOrNot {

	public static void main(String[] args) {
		int num = 17, count = 0;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				count++;
			}
		}

		if (count == 0) {
			System.out.println("No is prime no");
		} else {
			System.out.println("No is prime");
		}

	}

}
