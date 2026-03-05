package java8Program;

import java.util.Arrays;
import java.util.List;

public class FindTheNumberStartWith1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,2,12,13,5,6);
		
		list.stream().map(e->e + "")
		             .filter(e -> e.startsWith("1"))
		             .forEach(System.out::println);
	}

}
