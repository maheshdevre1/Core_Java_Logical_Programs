package java8Program;

import java.util.Arrays;
import java.util.List;

public class FindNoStartingWith1FromListOFInteger {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,5,6,2,34,90);
		list.stream()
		    .map(s->s+"")
		    .filter(s->s.startsWith("3"))
		    .forEach(System.out::println);
	}

}
