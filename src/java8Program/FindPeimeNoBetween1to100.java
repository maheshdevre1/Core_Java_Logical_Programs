package java8Program;

import java.util.stream.IntStream;

public class FindPeimeNoBetween1to100 {
	
	public static void main(String[] args) {
        // Print a message indicating the purpose of the program
        System.out.println("Prime numbers between 1 and 100:");

        // Generate numbers from 2 to 100 and filter out the prime numbers
        IntStream.rangeClosed(2, 10)
                 .filter(num -> {
                     // Check if the number is greater than 1 and not divisible by any number from 2 to its square root
                     return num > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(num))
                                                .noneMatch(i -> num % i == 0);
                 })
                 // Print each prime number
                 .forEach(num -> System.out.print(num + " "));
    }

}
