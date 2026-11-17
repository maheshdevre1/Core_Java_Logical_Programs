package JavaAllPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ArrayAllPrograms {
	public static void main(String[] args) {

	Practice();
	// SubArrayWhoseSumIsNumber();
    //MoveZerosFront();
      //Find_the_minimum_length_subarray_whose_sum_equals_a_given_target();
    //	MissingNumberFromArray();//Find missing number from Array arr = [4,1,3,8,6]
	// min =1 and max =8
	 find_binary_number_from_array(); // binary number contain 01, 00
	//-------------------------------------------
	//SeparateZerosFromNonZeros();
//Given_three_integer_arrays_merge_them_into_a_single_array_and_sort_the_result_in_descending_order();
		// merge_two_array_element();
	//	MergeTwoArraysAndRemoveDuplicatesProgram();
		// find_duplicate_element_in_array();
		// find_max_and_min_element_from_array();
		//revrese_of_array_element();
	     //check_two_given_array_are_equal_or_not();
		//find_common_element_from_two_array();
			// find_missing_number_in_arrays();
		
		//from_word_of_array_print_a_word_which_contains_vowels();//String[] arr = { "one", "two", "four", "mh" };
		//PairsOfElementsInArray();
		// frequency_of_array_element();
		 //MostFrequentElementProgram();
		// find_1st_repeating_and_non_repeating_element_from_array();
		//search_array_element_find_index_value();
		// convert_number_into_array();
		// addition_of_array_element();
		// MultiplicationOfArrayElement();

	}
	
	
	private static void MoveZerosFront() {
		int[] arr = {1, 0, 3, 0, 5, 0, 2};

        int index = arr.length - 1;

        // Move non-zero elements from right to left
        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] != 0) {
                arr[index] = arr[i];
                index--;
            }
        }
       System.out.println(index);
        
        // Fill remaining positions with 0
        for (int i = index; i >= 0; i--) {
            arr[i] = 0;
        }

        System.out.println(Arrays.toString(arr));
		
	}


	private static void Find_the_minimum_length_subarray_whose_sum_equals_a_given_target() {
		    int[] arr = {2, 3, 1, 2, 4, 3};
		    int target = 7;
		    int minLength = 0;
		    boolean found = false;
		    for (int i = 0; i < arr.length; i++) {
		        int sum = 0;
		        for (int j = i; j < arr.length; j++) {
		            sum = sum + arr[j];
		            if (sum == target) {
		            	System.out.println(arr[j]+ " "+ arr[i]);
		                int currentLength = j - i + 1;
		                System.out.println("currentLength ==> "+ currentLength);
		                
		                if (!found || currentLength < minLength) {
		                    minLength = currentLength;
		                    System.out.println("minLength ==> "+ minLength);
		                    found = true;
		                }
		            }
		        }
		    }
		    if (!found) {
		        System.out.println("No sub array found");
		    } else {
		        System.out.println("Min length ==> " + minLength);
		    }
		
	}


	private static void Practice() {
	//	Find_the_minimum_length_subarray_whose_sum_equals_a_given_target();
				//Given_three_integer_arrays_merge_them_into_a_single_array_and_sort_the_result_in_descending_order();
				// merge_two_array_element();
			//	MergeTwoArraysAndRemoveDuplicatesProgram();
				// find_duplicate_element_in_array();
				// find_max_and_min_element_from_array();
				//revrese_of_array_element();
			     //check_two_given_array_are_equal_or_not();
				//find_common_element_from_two_array();
				// MissingNumberFromArray();//Find missing number from Array arr = [4,1,3,8,6]
				// find_missing_number_in_arrays();
				// min =1 and max =8
				//from_word_of_array_print_a_word_which_contains_vowels();//String[] arr = { "one", "two", "four", "mh" };
				PairsOfElementsInArray();
		
		int[] arr = {1, 0, 3, 0, 5, 0, 2};
		int index = arr.length-1;
		

	
				
	}

	private static void Given_three_integer_arrays_merge_them_into_a_single_array_and_sort_the_result_in_descending_order() {
		int a1[] = {1,4,2,7};
		int a2[] = {3,4,6,7};
		int a3[] = {5,4,9,2};
		
		int merge[] = new int[a1.length+a2.length+a3.length];
		
		
		for(int i=0; i<a1.length; i++) {
			merge[i]= a1[i];
		}
		
		for(int i=0; i<a2.length; i++) {
			merge[a1.length+i]= a2[i];
		}
		
		for(int i=0; i<a3.length; i++) {
			merge[a1.length+a2.length+i]= a3[i];
		}
		
		//System.out.println(Arrays.toString(merge));
		
		for(int i=0; i<merge.length; i++) {
			for(int j=i+1; j<merge.length; j++) {
				if(merge[i]<merge[j]) {
					int temp = merge[i];
					merge[i] = merge[j];
					merge[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(merge));
	}

	

	private static void MissingNumberFromArray() {
		int arr[] = { 4, 1, 3, 8, 6 };
		int min = 1, max = 8;
		Set<Integer> set = new HashSet<>();
		for (int a : arr) {
			set.add(a);
		}
		System.out.println("Missing Number");
		for (int i = min; i <= max; i++) {
			if (!set.contains(i)) {
				System.out.println(i);
			}
		}

	}

	private static void from_word_of_array_print_a_word_which_contains_vowels() {
		String[] arr = { "one", "two", "four", "mh" };
		for (String a : arr) {
			String word = a;
			char ch[] = word.toCharArray();
			for (char c : ch) {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					System.out.println(word);
					break;
				}
			}
		}

	}

	private static void union_and_intersection_of_multiple_arrays() {
		// Define multiple arrays
		int[] inputArray1 = { 2, 3, 4, 7, 1 };
		int[] inputArray2 = { 4, 1, 3, 5 };
		int[] inputArray3 = { 8, 4, 6, 2, 1 };
		int[] inputArray4 = { 7, 9, 4, 1 };

		// Create a HashSet to store unique elements (ensuring distinct elements for
		// UNION)
		HashSet<Integer> unionSet = new HashSet<>();

		// Create a HashSet to track INTERSECTION elements (starting with first array)
		HashSet<Integer> intersectionSet = new HashSet<>();
		for (int num : inputArray1) {
			intersectionSet.add(num);
		}

		// Display input arrays
		System.out.println("Input Arrays:");
		System.out.println("======================");

		// Process each array for UNION and INTERSECTION
		int[][] inputArrays = { inputArray1, inputArray2, inputArray3, inputArray4 };
		for (int[] inputArray : inputArrays) {
			// Print the current array
			System.out.println(Arrays.toString(inputArray));

			// Add elements to the HashSet for UNION operation (ensures distinct elements)
			for (int num : inputArray) {
				unionSet.add(num);
			}

			// Perform INTERSECTION (retain only common elements)
			intersectionSet.retainAll(Arrays.asList(Arrays.stream(inputArray).boxed().toArray(Integer[]::new)));
		}

		System.out.println("===========================");
		System.out.println("Union Of All Input Arrays:");
		System.out.println("===========================");
		System.out.println(unionSet);

		System.out.println("===========================");
		System.out.println("Intersection Of All Input Arrays:");
		System.out.println("===========================");
		System.out.println(intersectionSet);

	}

	private static void SubArrayWhoseSumIsNumber() {
		int[] inputArray = { 42, 15, 12, 8, 6, 32 };
		int inputNumber = 26;
		boolean found = false;
		for (int i = 0; i < inputArray.length; i++) {
			int sum = 0;
			for (int j = i; j < inputArray.length; j++) {
				sum = sum + inputArray[j];
				if (sum == inputNumber) {
					for (int k = i; k <= j; k++) {
						System.out.print(inputArray[k] + " ");

					}

					found = true;
					break;
				}

			}
			if (found) {
				break;
			}
		}
		if (!found) {
			System.out.println("No matching element");
		}
	}

	private static void SeparateZerosFromNonZeros() {
		// Define the input array
		int[] inputArray = { 12, 0, 7, 0, 8, 0, 3 };
		int newArray[] = new int[inputArray.length];
		int index = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] != 0) {
				newArray[index] = inputArray[i];
				index++;
			}
		}

		System.out.println(Arrays.toString(newArray));

	}

	private static void PairsOfElementsInArray() {
		int[] arr = { 4, 6, 5, -10, 8, 5, 20 };

		// Define the target sum
		int inputNumber = 10;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == inputNumber) {
					System.out.println(arr[i] + " + " + arr[j]);
				}
			}
		}

	}

	private static void MultiplicationOfArrayElement() {
		int arr[] = { 10, 20, 30, 40, 50 };
		int length = arr.length;
		int mul = 1;
		for (int i = 0; i < length; i++) {
			mul = mul * arr[i];
		}
		System.out.println("mul of array element " + mul);
	}

	private static void MostFrequentElementProgram() {
		int[] inputArray = { 4, 5, 8, 7, 4, 7, 6, 7 };
		Map<Integer, Integer> map = new HashMap<>();
		for(int arr : inputArray) {
			if(map.containsKey(arr)) {
				map.put(arr, map.get(arr)+1);
			}else {
				map.put(arr, 1);
			}
		}
		
		System.out.println(map);
		int mostFrequentElement = inputArray[0];
		int frequencyOfElemnt = 1;
		
		for(Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() > frequencyOfElemnt) {
				mostFrequentElement = entry.getKey();
				frequencyOfElemnt = entry.getValue();
			}
		}
		
		System.out.println(mostFrequentElement + "  "+ frequencyOfElemnt);
	
	}

	private static void Java_program_to_find_leaders_in_an_array() {
		// Define the input array
		int[] inputArray = { 12, 9, 7, 14, 8, 6, 3 };

		// Get the length of the array
		int inputArrayLength = inputArray.length;

		// Assume the last element as the initial leader
		int max = inputArray[inputArrayLength - 1];

		System.out.println("The leaders in " + Arrays.toString(inputArray) + " are:");

		// The last element is always a leader, so print it
		System.out.println(inputArray[inputArrayLength - 1]);

		// Traverse the array from right to left (excluding the last element)
		for (int i = inputArrayLength - 2; i >= 0; i--) {
			// If the current element is greater than the max encountered so far
			if (inputArray[i] > max) {
				// Print the current element as a leader
				System.out.println(inputArray[i]);

				// Update max to the current element
				max = inputArray[i];
			}
		}
	}

	private static void FindSecondLargestElementInArray() {
		// Define the input array
		int[] input = { 45, 51, 28, 75, 49, 42 };

		// Initialize firstLargest and secondLargest
		int firstLargest, secondLargest;

		// Checking first two elements to initialize firstLargest and secondLargest
		if (input[0] > input[1]) {
			firstLargest = input[0];
			secondLargest = input[1];
		} else {
			firstLargest = input[1];
			secondLargest = input[0];
		}

		System.out.println("firstLargest ==> " + firstLargest);
		System.out.println("secondLargest ==> " + secondLargest);

		// Iterating through the rest of the array to find the second largest element
		for (int i = 2; i < input.length; i++) {
			if (input[i] > firstLargest) {
				secondLargest = firstLargest; // Update secondLargest
				firstLargest = input[i]; // Update firstLargest
			} else if (input[i] < firstLargest && input[i] > secondLargest) {
				secondLargest = input[i]; // Update secondLargest
			}
		}

		// Print the second largest element
		System.out.println("The second largest element is: " + secondLargest);

	}

	private static void convert_number_into_array() {
		int num = 12345;
		String str = String.valueOf(num); // Convert number to String

		char ch[] = str.toCharArray();

//		int[] arr = new int[str.length()];
//
//		for (int i = 0; i < str.length(); i++) {
//			arr[i] = Character.getNumericValue(str.charAt(i));
//		}
//
		System.out.println(Arrays.toString(ch));
	}

	private static void search_array_element_find_index_value() {
		int[] arr = { 4, 5, 6, 7, 2, 4, 5 };
		System.out.println(Arrays.binarySearch(arr, 5));
	}

	private static void sort_array_in_ascending_and_descending_order() {
		int arr[] = { 34, 12, 24, 67, 89, 23, 12 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int a : arr) {
			System.out.println(a);
		}

	}

	private static void revrese_of_array_element() {
		int arr[] = { 1, 3, 4, 6, 8, 9 };

		int length = arr.length;
		for (int i = length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}

	}

	private static void print_array_element() {
		int arr[] = { 3, 5, 6, 7, 9 };

		for (int a : arr) {
			System.out.println(a);
		}

	}

	private static void addition_of_array_element() {
		int arr[] = { 10, 20, 30, 40, 50 };
		int length = arr.length;
		int sum = 0;
		for (int i = 0; i < length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("sum of array element : " + sum);
	}

	private static void find_missing_number_in_arrays() {
		// Define the total number of elements including the missing one
		int n = 8;

		// Define the given array with one missing number
		int[] a = { 1, 4, 5, 3, 7, 8, 6 };

		// Step 1: Calculate the expected sum of first 'n' natural numbers
		// Using the formula: sum = (n * (n + 1)) / 2
		int sumOfNnumbers = (n * (n + 1)) / 2;

		// Step 2: Calculate the sum of elements present in the array
		int sumOfElements = 0;

		// Traverse through the array and accumulate the sum
		for (int i = 0; i < a.length; i++) {
			sumOfElements += a[i];
		}

		// Step 3: The missing number is the difference between the expected sum and
		// actual sum
		int missingNumber = sumOfNnumbers - sumOfElements;

		// Display the missing number
		System.out.println("Missing Number is = " + missingNumber);
	}

	private static void MergeTwoArraysAndRemoveDuplicatesProgram() {
		// Define two input arrays
		int[] arrayA = { 7, -5, 3, 8, -4, 11, -19, 21 };
		int[] arrayB = { 6, 13, -7, 0, 11, -4, 3, -5 };

		// Create a HashSet to store unique elements from both arrays
		HashSet<Integer> uniqueElements = new HashSet<>();

		// Add elements from both arrays to the HashSet
		for (int i = 0; i < arrayA.length; i++) {
			uniqueElements.add(arrayA[i]);
		}
		for (int i = 0; i < arrayB.length; i++) {
			uniqueElements.add(arrayB[i]);
		}

		// Convert HashSet back to an array
		int[] mergedArray = new int[uniqueElements.size()];
		Iterator<Integer> iterator = uniqueElements.iterator();
		int index = 0;
		while (iterator.hasNext()) {
			mergedArray[index++] = iterator.next();
		}

		// Sort the merged array
		Arrays.sort(mergedArray);

		// Print original arrays
		System.out.println("Array A: " + Arrays.toString(arrayA));
		System.out.println("Array B: " + Arrays.toString(arrayB));

		// Print merged and sorted array with no duplicates
		System.out.println("Sorted Merged Array With No Duplicates:");
		System.out.println(Arrays.toString(mergedArray));

	}

	private static void merge_two_array_element() {
		int[] array1 = { 1, 8, 3, 4};
		int[] array2 = { 4, 5, 6, 1};

		int[] mergedArray = new int[array1.length + array2.length];

		// Copy array1
		for (int i = 0; i < array1.length; i++) {
			mergedArray[i] = array1[i];
		}

		// Copy array2
		for (int i = 0; i < array2.length; i++) {
			mergedArray[array1.length + i] = array2[i];
		}
		
		Arrays.sort(mergedArray);

		System.out.println(Arrays.toString(mergedArray));
		
		Set<Integer> set = new HashSet<>();
		for(int m :  mergedArray) {
			set.add(m);
		}
		System.out.println(set);
	}

	private static void find_1st_repeating_and_non_repeating_element_from_array() {
		int arr[] = { 10, 20, 3, 10, 30, 20, 40, 10, 30, 40, 50 };
		Map<Integer, Integer> map = new HashMap<>();
		for (int a : arr) {
			if (map.containsKey(a)) {
				int value = map.get(a);
				map.put(a, value + 1);

			} else {
				map.put(a, 1);
			}
		}

		System.out.println(map);

		for (int a : arr) {
			if (map.get(a) > 1) {
				System.out.println("First repeating element ==> " + a);
				break;
			}
		}

		for (int a : arr) {
			if (map.get(a) == 1) {
				System.out.println("First non repeating element ==> " + a);
				break;
			}
		}

	}

	private static void frequency_of_array_element() {
		int arr[] = { 10, 20, 10, 30, 20, 40, 10, 30, 40, 50 };
		Map<Integer, Integer> map = new HashMap<>();
		for (int a : arr) {
			if (map.containsKey(a)) {
				int value = map.get(a);
				map.put(a, value + 1);

			} else {
				map.put(a, 1);
			}
		}

		System.out.println(map);

	}

	private static void find_max_and_min_element_from_array() {
		int arr[] = { 10, 20, 5, 89, 45 };

		int smallest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < smallest) {// for largest element arr[i]>smallest
				smallest = arr[i];
			}
		}
		System.out.println("Smallest element is ==> " + smallest);
	}

	private static void find_duplicate_element_in_array() {
		int arr[] = { 2, 4, 5, 6, 4, 9, 2, 5 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}

	private static void find_binary_number_from_array() {
		int[] arr = { 101, 110, 123, 1001, 456, 1110, 10 };
		System.out.println("Binary numbers in the array are:");
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			boolean isBinary = true;
			int temp = num;
			while (temp > 0) {
				int digit = temp % 10;
				if (digit != 0 && digit != 1) {
					isBinary = false;
					break;
				}
				temp /= 10;
			}
			if (isBinary) {
				System.out.print(num + " ");
			}
		}

	}

	private static void find_common_element_from_two_array() {
		String[] s1 = { "ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR" };

		String[] s2 = { "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR" };

		HashSet<String> set = new HashSet<String>();

		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s1[i].equals(s2[j])) {
					set.add(s1[i]);
				}

			}
		}

		System.out.println(set); // OUTPUT : [THREE, FOUR, FIVE]

	}

	private static void check_two_given_array_are_equal_or_not() {
		int a1[] = { 2, 3, 4 };
		int a2[] = { 1, 2, 3 };
		System.out.println(Arrays.equals(a1, a2));
		int a3[] = { 2, 3, 4 };
		System.out.println(Arrays.equals(a1, a3));

	}

}
