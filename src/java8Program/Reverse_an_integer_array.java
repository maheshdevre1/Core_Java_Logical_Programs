package java8Program;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Reverse_an_integer_array {
	
	public static void main(String[] args) 
    {
		 // Declare and initialize an integer array with some values
        int[] array = new int[] {5, 1, 7, 3, 9, 6};

        // Create a reversed version of the array using IntStream
        // IntStream.rangeClosed(1, array.length) generates numbers from 1 to array.length (inclusive)
        // For each i, we access the element at position (array.length - i) to reverse the order
        // .map(...) applies this transformation
        // .toArray() collects the result into a new array
        int[] reversedArray = IntStream.rangeClosed(1, array.length)
                                       .map(i -> array[array.length - i])
                                       .toArray();

        // Print the reversed array using Arrays.toString for readable output
        System.out.println(Arrays.toString(reversedArray));
    }

}
