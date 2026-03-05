

package NumberProgram;

public class SumOfSquareOddOrEvenDigit {
	public static void main(String[] args) {
		int num = 123456789;
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			if (rem % 2 != 0) {
				sum = sum + (rem * rem);
			}
			num = num / 10;
		}

		System.out.println("Sum of square of even digit ==> " + sum);
	}

}
