package java8Program;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortListOfIntegers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 4, 2, 1, 2, 4, 5, 6, 7);
		list.stream()
				//.sorted()
				.sorted(Collections.reverseOrder())
				.forEach(System.out::println);

	}

}
