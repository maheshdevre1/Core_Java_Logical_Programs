package java8Program;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse_List_Of_Integer {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,1,3,5,2,9,3,5,6,7);
		Collections.reverse(list);
		list.forEach(System.out::println);
	}

}
