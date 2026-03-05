package java8Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindEvenNoFromListOfInteger {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 1, 3, 4, 5, 6, 7, 8, 9);
		list.stream()
		    .filter(e -> e % 2 != 0)
		    .forEach(System.out::println);
		}
	
	    
}
