package ArrayProgram;

public class FindBinaryNumbersFromArray {
	public static void main(String[] args) {
		int[] arr = { 101, 110, 123, 1001, 456, 1110, 10 };
        System.out.println("Binary numbers in the array are:");
        for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			boolean isBinary = true;
            int temp = num;
			while (temp > 0) {
				int digit = temp % 10;
				if (digit != 0 && digit != 1) {
					isBinary = false;
					break;
				}
				temp /= 10;
			}
            if (isBinary) {
				System.out.print(num + " ");
			}
		}
	}
}
