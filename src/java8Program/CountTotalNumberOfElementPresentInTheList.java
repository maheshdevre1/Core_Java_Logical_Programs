package java8Program;

import java.util.Arrays;
import java.util.List;

public class CountTotalNumberOfElementPresentInTheList {
	public static void main(String args[]) {
		List<String> list = Arrays.asList("100", "456","567", "234");
		long count = list.stream().count();
		System.out.println("count no of element present in the string ==> " +count);
	}
}
