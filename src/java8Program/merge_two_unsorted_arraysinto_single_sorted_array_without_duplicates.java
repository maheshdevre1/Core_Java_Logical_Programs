package java8Program;

import java.util.Arrays;
import java.util.stream.IntStream;

public class merge_two_unsorted_arraysinto_single_sorted_array_without_duplicates {
	
	public static void main(String[] args) {

		int a[] = { 3, 5, 6, 12, 1, 4 };
		int b[] = { 5, 2, 1, 5, 6, 9 };
		int c[] = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(c));

	}

}
