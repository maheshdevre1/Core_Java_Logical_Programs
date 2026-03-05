package ArrayProgram;

import java.util.Arrays;

public class convert_number_into_array {
	public static void main(String[] args) {
		int num = 12345;
		String str = String.valueOf(num); // Convert number to String
		int[] arr = new int[str.length()];

		for (int i = 0; i < str.length(); i++) {
		    arr[i] = Character.getNumericValue(str.charAt(i));
		}

		System.out.println(Arrays.toString(arr));
	}

}
