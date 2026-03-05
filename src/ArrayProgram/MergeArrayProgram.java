package ArrayProgram;

import java.util.Arrays;

public class MergeArrayProgram {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 4, 5, 6 };

		int[] mergedArray = new int[array1.length + array2.length];

		// Copy array1
		for (int i = 0; i < array1.length; i++) {
			mergedArray[i] = array1[i];
		}

		// Copy array2
		for (int i = 0; i < array2.length; i++) {
			mergedArray[array1.length + i] = array2[i];
		}

		System.out.println(Arrays.toString(mergedArray));
	}
}
