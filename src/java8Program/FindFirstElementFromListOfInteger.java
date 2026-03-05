package java8Program;

import java.util.Arrays;
import java.util.List;

public class FindFirstElementFromListOfInteger {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(23, 89, 23);
		list.stream()
		    .findFirst()
		    .ifPresent(System.out::println);
	}
}
