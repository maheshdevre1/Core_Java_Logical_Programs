package NumberProgram;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a = 0, b = 1, c = 50;
		while (c <= 100) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;

		}
	}

}
