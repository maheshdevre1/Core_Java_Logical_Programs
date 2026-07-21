package java8Program;

import java.util.Arrays;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Allprograms {
	public static void main(String[] args) {
		//Practice();
		//listOfIntegerRemoveDuplicatesReplaceEvenWithEAndOddWithO();
		// FrequencyOfCharacter();
		// frequency_of_a_word();
		// find_second_highest_number_or_second_lowest();
		// findduplicatefromlistofInteger
		// sort_the_element_ascending_or_descending_order_using_java8();
		// find_the_count_of_integer();
		// find_even_or_odd();
		// find_maximum_or_minimum_element_from_list_of_integer();
		// find_first_element_from_list_of_integer();
		// check_no_is_prime_or_not();
		// find_the_prime_number_between_the_range();

		// next_practice_start_from_here
		// How_do_you_merge_two_unsorted_arrays_into_single_sorted_array_using_Java_8_streams();
		// How_do_you_merge_two_unsorted_arrays_into_single_sorted_array_without_duplicates();
		// How_do_you_get_three_maximum_numbers_and_three_minimum_numbers_from_the_given_list_of_integers();
		// revrese_list_of_integer();
		// Reverse_an_integer_array();
		// WAP_using_stram_api_Employee_salary_is_above_30000_create_a_employee_object();
//		List<Employee> list = Arrays.asList(
//				new Employee(1, "John", 25000),
//                new Employee(2, "Alice", 32000),
//                new Employee(3, "Bob", 45000),
//                new Employee(4, "David", 28000),
//                new Employee(5, "Eva", 37000));
//		
//		list.stream()
//		    .filter(e -> e.getSalary()>30000)
//		    .forEach(System.out::println);
		// create a functional interface
//		  FuncInterfaceExample obj = (a,b) -> a+b; 
//	      System.out.println("Sum of two numbers is: " +obj.sum(4,8));
//		FindTheNumberStartWith1();
		// find_common_element_from_the_array_from_two_array();//list of array

		// check_if_two_strings_are_anagrams_or_not();
		// Find_sum_of_all_digits_of_a_number_in_Java8();
		// list_of_strings_sort_them_according_to_increasing_order_of_their_length();
		// Given_an_integer_array_find_sum_and_average_of_all_elements();
		//Reverse_each_word_of_a_string_using_Java_8_streams();
		//How_do_you_find_sum_of_first_10_natural_numbers();
		//Print_first_10_even_numbers();
		//How_do_you_find_the_most_repeated_element_in_an_array_of_list();
		//Palindrome_program_using_Java8_streams();
		//list_of_strings_find_out_those_strings_which_start_with_anumber();
		//Print_duplicate_characters_in_a_string();
		//Find_first_repeated_character_in_a_string();
		//Fibonacci_Series();
		//First_10_odd_numbers();
		//How_do_you_get_last_element_of_an_array();
		// Write a program using stram api Employee salary is above 30000 create a
		// employee object
		// List of employee object
		/* New program */
		// reverse a list of integer

	}

	private static void listOfIntegerRemoveDuplicatesReplaceEvenWithEAndOddWithO() {
	    List<Integer> list = Arrays.asList(2,3,2,5);
	    list.stream().distinct().map(i->i%2==0? "E":"O").forEach(System.out::println);
		
	}

	private static void How_do_you_get_last_element_of_an_array() {
		 List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
	        
	        System.out.println(listOfStrings.size());
	         
	        String lastElement = listOfStrings.stream().skip(listOfStrings.size() - 1).findFirst().get();
	         
	        System.out.println(lastElement);
	}

	private static void First_10_odd_numbers() {
		Stream.iterate(new int[] {1, 3}, f -> new int[] {f[1], f[1]+2})
        .limit(10)
        .map(f -> f[0])
        .forEach(i -> System.out.print(i+" "));
	}

	private static void Fibonacci_Series() {
		Stream.iterate(new int[] {0, 1}, f -> new int[] {f[1], f[0]+f[1]})
        .limit(10)
        .map(f -> f[0])
        .forEach(i -> System.out.print(i+" "));
		
	}

	private static void Find_first_repeated_character_in_a_string() {
		 // Input string where we want to find the first repeated character.
	     // All whitespace characters are removed using replaceAll, and the string is converted to lowercase.
	     String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();

	     // Create a Map to store the count of each character using Java Streams.
	     // 1. Convert the string into an array of characters (split by "").
	     // 2. Group by character (Function.identity()).
	     // 3. Count the occurrences of each character using Collectors.counting().
	     Map<String, Long> charCountMap = 
	         Arrays.stream(inputString.split(""))
	               .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	     
	     // Print the map to see the frequency of each character.
	     System.out.println(charCountMap);
	     
	     // Find the first repeated character:
	     // 1. Stream the entry set of the map.
	     // 2. Filter entries with value > 1 (i.e., repeated characters).
	     // 3. Map to the character key.
	     // 4. Use findFirst() to get the first repeated character (based on the map's iteration order).
	     // 5. Call get() to extract the value from the Optional.
	     String firstRepeatedChar = charCountMap.entrySet()
	                                            .stream()
	                                            .filter(entry -> entry.getValue() > 1)
	                                            .map(entry -> entry.getKey())
	                                            .findFirst()
	                                            .get();
	     
	     // Print the first repeated character.
	     System.out.println(firstRepeatedChar);	
		
	}

	private static void Print_duplicate_characters_in_a_string() {
		String inputString1 = "Java Concept Of The Day";
        String smallString = inputString1.replaceAll("\\s+","");
        String lowerString = smallString.toLowerCase();
        
        Set<String> uniqueChars = new HashSet<>();
         
        Set<String> duplicateChars = 
                Arrays.stream(lowerString.split(""))
                        .filter(ch -> ! uniqueChars.add(ch))
                        .collect(Collectors.toSet());
         
        System.out.println(duplicateChars);
		
	}

	private static void list_of_strings_find_out_those_strings_which_start_with_anumber() {
		 List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
         
	        listOfStrings.stream()
	                     .filter(str -> Character.isDigit(str.charAt(0)))
	                     .forEach(System.out::println);
		
	}

	private static void Palindrome_program_using_Java8_streams() {
		 // Input string to check for palindrome
        String str = "ROTATOR";
        int len = str.length();

        // Check if the string is a palindrome using Java 8 streams
        // IntStream.range(0, str.length()/2) creates a stream of indices from 0 to middle of the string
        // .noneMatch(...) checks if there's any index 'i' where characters at position 'i' and 'length-i-1' don't match
        // If none of them mismatch (i.e., noneMatch is true), then the string is a palindrome
        boolean isItPalindrome = IntStream.range(0, len/ 2)
                                          .noneMatch(i -> str.charAt(i) != str.charAt(len - i - 1));

        // If the boolean is true, it means the string is a palindrome
        if (isItPalindrome)
        {
            System.out.println(str + " is a palindrome");
        }
        else
        {
            System.out.println(str + " is not a palindrome");
        }
	}

	private static void How_do_you_find_the_most_repeated_element_in_an_array_of_list() {

        // Create a list of strings with some repeated elements
        List<String> listOfStrings = Arrays.asList(
            "Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil"
        );

        // Use Java Stream to group and count occurrences of each element in the list
        // groupingBy(Function.identity(), counting()) will return a Map with the element as key and its count as value
        Map<String, Long> elementCountMap = listOfStrings.stream()
                                                         .collect(Collectors.groupingBy(
                                                             Function.identity(), // Group by the element itself
                                                             Collectors.counting() // Count each occurrence
                                                         ));

        // Print the complete map showing element counts
        System.out.println(elementCountMap); 
        // Example Output: {Note Book=2, Pencil=2, Eraser=1, Pen=3}

        // Find the entry (key-value pair) with the highest count using max() and comparingByValue()
        Entry<String, Long> mostFrequentElement = elementCountMap.entrySet()
                                                                 .stream()
                                                                 .max(Map.Entry.comparingByValue()) // Find the max by value
                                                                 .get(); // Get the actual entry
        
        System.out.println(mostFrequentElement);

        // Print the most frequent element
        System.out.println("Most Frequent Element : " + mostFrequentElement.getKey());

        // Print the count of that most frequent element
        System.out.println("Count : " + mostFrequentElement.getValue());
		
	}

	private static void Print_first_10_even_numbers() {
		  IntStream.rangeClosed(1, 10).map(i -> i * 2).forEach(System.out::println);//even number
	      System.out.println("==================");
	      IntStream.rangeClosed(1, 10).map(i -> i * 2 - 1).forEach(System.out::println);//odd number
	}

	private static void How_do_you_find_sum_of_first_10_natural_numbers() {
		int sum = IntStream.range(1, 11).sum();
        System.out.println(sum);
		
	}

	private static void Reverse_each_word_of_a_string_using_Java_8_streams() {
		    String str = "Java Concept Of The Day";
         
	        String reversedStr = Arrays.stream(str.split(" "))
	                                    .map(word -> new StringBuffer(word).reverse())
	                                    .collect(Collectors.joining(" "));
	         
	        System.out.println(reversedStr);
	}

	private static void Given_an_integer_array_find_sum_and_average_of_all_elements() {
		int[] a = new int[] { 45, 12, 56, 15, 24, 75, 31, 89 };
		int sum = Arrays.stream(a).sum();
		System.out.println("Sum = " + sum);
		double average = Arrays.stream(a).average().getAsDouble();
		System.out.println("Average = " + average);

	}

	private static void list_of_strings_sort_them_according_to_increasing_order_of_their_length() {
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
		listOfStrings.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

	}

	private static void Find_sum_of_all_digits_of_a_number_in_Java8() {
		int i = 15623; // Declare an integer with a given number

		// Convert the integer to a string, split the digits into an array,
		// parse them as integers, and sum them using Java Streams
		Integer sumOfDigits = Stream.of(String.valueOf(i).split("")) // Convert number to string and split digits
				.collect(Collectors.summingInt(Integer::parseInt)); // Convert characters to integers and sum them

		// Print the final sum of digits
		System.out.println(sumOfDigits);

	}

	private static void check_if_two_strings_are_anagrams_or_not() {
		// Define two strings to check for anagrams
		String s1 = "RaceCar";
		String s2 = "CarRace";

		// Convert the string into a stream of characters, convert to uppercase, sort
		// them, and then join them back
		s1 = Stream.of(s1.split("")) // Split string into individual characters
				// .map(String::toUpperCase) // Convert each character to uppercase for
				// case-insensitive comparison
				.sorted() // Sort the characters alphabetically
				.collect(Collectors.joining()); // Join them back into a sorted string

		System.out.println(s1);

		s2 = Stream.of(s2.split(""))
				// .map(String::toUpperCase)
				.sorted().collect(Collectors.joining());

		System.out.println(s2);

		// Check if both transformed strings are equal
		if (s1.equals(s2)) {
			System.out.println("Two strings are anagrams"); // If sorted versions match, they are anagrams
		} else {
			System.out.println("Two strings are not anagrams"); // Otherwise, they are not anagrams
		}

	}

	private static void find_common_element_from_the_array_from_two_array() {
		List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);

		List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

		list1.stream().filter(list2::contains).forEach(System.out::println);

	}

	private static void FindTheNumberStartWith1() {
		List<Integer> list = Arrays.asList(2, 5, 6, 12, 34, 90);
		list.stream().map(s -> s + "").filter(s -> s.startsWith("1")).forEach(System.out::println);

	}

	class Employee {
		private int id;
		private String name;
		private double salary;

		// Constructor
		public Employee(int id, String name, double salary) {
			this.id = id;
			this.name = name;
			this.salary = salary;
		}

		// Getters
		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public double getSalary() {
			return salary;
		}

		@Override
		public String toString() {
			return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + '}';
		}
	}

	@FunctionalInterface
	interface FuncInterfaceExample {
		int sum(int a, int b);

		default int multiply(int a, int b) {
			return a * b;
		}
	}

	private static void Reverse_an_integer_array() {
		// Declare and initialize an integer array with some values
		int[] array = new int[] { 5, 1, 7, 3, 9, 6 };

		// Create a reversed version of the array using IntStream
		// IntStream.rangeClosed(1, array.length) generates numbers from 1 to
		// array.length (inclusive)
		// For each i, we access the element at position (array.length - i) to reverse
		// the order
		// .map(...) applies this transformation
		// .toArray() collects the result into a new array
		int[] reversedArray = IntStream.rangeClosed(1, array.length).map(i -> array[array.length - i]).toArray();

		// Print the reversed array using Arrays.toString for readable output
		System.out.println(Arrays.toString(reversedArray));

	}

	private static void revrese_list_of_integer() {
		List<Integer> list = Arrays.asList(2, 1, 3, 5, 2, 9, 3, 5, 6, 7);
		Collections.reverse(list);
		list.forEach(System.out::println);

	}

	private static void How_do_you_get_three_maximum_numbers_and_three_minimum_numbers_from_the_given_list_of_integers() {
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

		// 3 minimum Numbers

		System.out.println("-----------------");

		System.out.println("Minimum 3 Numbers");

		System.out.println("-----------------");

		listOfIntegers.stream().sorted().limit(3).forEach(System.out::println);

		// 3 Maximum Numbers

		System.out.println("-----------------");

		System.out.println("Maximum 3 Numbers");

		System.out.println("-----------------");

		listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

	}

	private static void How_do_you_merge_two_unsorted_arrays_into_single_sorted_array_without_duplicates() {
		int a[] = { 3, 5, 6, 12, 1, 4 };
		int b[] = { 5, 2, 1, 5, 6, 9 };
		int c[] = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
		System.out.println(Arrays.toString(c));

	}

	private static void How_do_you_merge_two_unsorted_arrays_into_single_sorted_array_using_Java_8_streams() {
		int[] a = new int[] { 4, 2, 7, 1 };

		int[] b = new int[] { 8, 3, 9, 5 };

		int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();

		System.out.println(Arrays.toString(c));

	}

	private static void find_the_prime_number_between_the_range() {
		// Print a message indicating the purpose of the program
		System.out.println("Prime numbers between 1 and 100:");

		// Generate numbers from 2 to 100 and filter out the prime numbers
		IntStream.rangeClosed(2, 10).filter(num -> {
			// Check if the number is greater than 1 and not divisible by any number from 2
			// to its square root
			return num > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(num)).noneMatch(i -> num % i == 0);
		})
				// Print each prime number
				.forEach(num -> System.out.print(num + " "));

	}

	private static void check_no_is_prime_or_not() {
		// Define the number to check
		int number = 30;

		int sqr = (int) Math.sqrt(number);
		System.out.println("sqr ==> " + sqr);

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

	private static void find_first_element_from_list_of_integer() {
		List<Integer> list = Arrays.asList(23, 89, 23);
		list.stream().findFirst().ifPresent(System.out::println);

	}

	private static void find_maximum_or_minimum_element_from_list_of_integer() {
		List<Integer> list = Arrays.asList(3, 1, 6, 7, 2, 3);
		int min = list.stream()// .min(Integer::compare)
				.max(Integer::compare).get();
		System.out.println(min);
	}

	private static void find_even_or_odd() {
		List<Integer> list = Arrays.asList(4, 1, 3, 3, 2, 1);
		list.stream().filter(e -> e % 2 != 0).forEach(System.out::println);

	}

	private static void find_the_count_of_integer() {
		List<Integer> list = Arrays.asList(4, 1, 3, 3, 2, 1);
		long count = list.stream().count();
		System.out.println(count);

	}

	private static void sort_the_element_ascending_or_descending_order_using_java8() {
		List<Integer> list = Arrays.asList(4, 1, 3, 3, 2, 1);
		// list.stream().sorted().forEach(System.out::println); // for Ascending order
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println); // For Descending order

	}

	private static void find_second_highest_number_or_second_lowest() {
		List<Integer> list = Arrays.asList(2);

		int secondHighest = list.stream().sorted((a, b) -> b - a).distinct().skip(1).findFirst()
				.orElseThrow(() -> new RuntimeException("List does not have a enough space"));

		System.out.println(secondHighest);

	}

	private static void Practice() {
		 List<Integer> list = Arrays.asList(2,6,7,8,9,1,4,8);
		 list.stream().distinct().map(i->i%2==0 ? "e" : "o").forEach(System.out::println);


	}

	private static void frequency_of_a_word() {
		List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler",
				"Note Book", "Pencil");

		Map<String, Long> stationeryCountMap = stationeryList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(stationeryCountMap);

	}

	private static void FrequencyOfCharacter() {
		// Initializing the input string.
		String inputString = "Java Concept Of The Day";

		// This line creates a Map (key-value pairs) to store each character as the key
		// and its frequency (count) as the value.
		Map<Character, Long> charCountMap = inputString.chars() // Converts the input string into an IntStream of
																// character Unicode values.
				.mapToObj(c -> (char) c) // Converts each int (Unicode) value back to its corresponding character.
				.collect(Collectors.groupingBy(Function.identity(), // Groups by each unique character.
						Collectors.counting() // Counts how many times each character appears.
				));

		// Printing the resulting map, where each key is a character and its value is
		// the count.
		System.out.println(charCountMap);

	}
}
