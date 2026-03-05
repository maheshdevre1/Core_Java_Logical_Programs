package java8Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSecondHighestNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2);
		
		int secondHighest = list.stream()
				                .sorted((a,b) -> b-a)
				                .distinct()
				                .skip(1)
				                .findFirst()
				                .orElseThrow(()-> new RuntimeException("List does not have a enough space"));
		
		System.out.println(secondHighest);
		

	}
}
