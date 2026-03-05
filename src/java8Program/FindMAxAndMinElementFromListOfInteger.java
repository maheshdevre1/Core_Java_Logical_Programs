package java8Program;

import java.util.Arrays;
import java.util.List;

public class FindMAxAndMinElementFromListOfInteger {

	public static void main(String args[]) {
		List<Integer> list = Arrays.asList(3, 1, 6, 7, 2, 3);
		int min = list.stream().min(Integer::compare)
				// .max(Integer::compare)
				.get();

		System.out.println(min);
	}
}
