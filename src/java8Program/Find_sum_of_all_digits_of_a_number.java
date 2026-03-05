package java8Program;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Find_sum_of_all_digits_of_a_number {

	public static void main(String[] args) {
        int i = 15623;  // Declare an integer with a given number

        // Convert the integer to a string, split the digits into an array, 
        // parse them as integers, and sum them using Java Streams
        Integer sumOfDigits = Stream.of(String.valueOf(i)
        		                    .split(""))  // Convert number to string and split digits
                                    .collect(Collectors.summingInt(Integer::parseInt));  // Convert characters to integers and sum them

        // Print the final sum of digits
        System.out.println(sumOfDigits);
    }

}
