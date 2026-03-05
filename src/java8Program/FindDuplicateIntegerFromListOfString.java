package java8Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateIntegerFromListOfString {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("java", "is", "coding", "language", "java", "is");
		Set<String> set = new HashSet<>();
		list.stream()
		    .filter(e -> !set.add(e))
		    .forEach(System.out::println);
    }
}
