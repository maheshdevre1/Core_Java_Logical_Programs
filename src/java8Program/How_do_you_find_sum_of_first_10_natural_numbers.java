package java8Program;

import java.util.stream.IntStream;

public class How_do_you_find_sum_of_first_10_natural_numbers {
	
	public static void main(String[] args) 
    {
        int sum = IntStream.range(1, 11).sum();
         
        System.out.println(sum);
    }

}
