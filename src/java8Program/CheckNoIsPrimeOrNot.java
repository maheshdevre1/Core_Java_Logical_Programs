package java8Program;

import java.util.stream.IntStream;

public class CheckNoIsPrimeOrNot {

	public static void main(String[] args) {
		// Define the number to check
		int number = 30;

		// Prime numbers are greater than 1, so check for edge cases first
		if (number < 2) {
			System.out.println(number + " is NOT a prime number.");
			return; // Exit the program early if the number is less than 2
		}

		// Using Java 8 Streams to check divisibility from 2 to sqrt(number)
		boolean isPrime = IntStream.rangeClosed(2, (int) Math.sqrt(number)) // Loop from 2 to √number
				                   .noneMatch(i -> number % i == 0); // If any number divides 'number', it's NOT prime

		if (isPrime == true) {
			System.out.println("No is prime");
		} else {
			System.out.println("No is not prime");
		}
	}

}
