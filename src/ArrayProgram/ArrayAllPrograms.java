package ArrayProgram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ArrayAllPrograms {
	public static void main(String[] args) {
		// check_two_given_array_are_equal_or_not();
		// find_common_element_from_two_array();
		// find_binary_number_from_array(); // binary number contain 01, 00
		// find_duplicate_element_in_array();
		// find_max_and_min_element_from_array();
		// frequency_of_array_element();
		// find_1st_repeating_and_non_repeating_element_from_array();
		// merge_two_array_element();
		// MergeTwoArraysAndRemoveDuplicatesProgram();
		// find_missing_number_in_arrays();
		// addition_of_array_element();
		// print_array_element();
		// revrese_of_array_element();
		// sort_array_in_ascending_and_descending_order();
		// search_array_element_find_index_value();
		// convert_number_into_array();
		//FindSecondLargestElementInArray();
		//Java_program_to_find_leaders_in_an_array();
		//MostFrequentElementProgram();
		//MultiplicationOfArrayElement();
		//PairsOfElementsInArray();
		//SeparateZerosFromNonZeros();
		//SubArrayWhoseSumIsNumber();
		union_and_intersection_of_multiple_arrays();
		
	}

	

	private static void union_and_intersection_of_multiple_arrays() {
		 // Define multiple arrays
        int[] inputArray1 = { 2, 3, 4, 7, 1 };
        int[] inputArray2 = { 4, 1, 3, 5 };
        int[] inputArray3 = { 8, 4, 6, 2, 1 };
        int[] inputArray4 = { 7, 9, 4, 1 };

        // Create a HashSet to store unique elements (ensuring distinct elements for UNION)
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
		 // Define the input array
        int[] inputArray = {42, 15, 12, 8, 6, 32};

        // Define the target sum
        int inputNumber = 26;

        // Initialize sum with the first element of the array
        int sum = inputArray[0];

        // Initialize the starting index of the subarray
        int start = 0;

        // Iterate through the array starting from the second element
        for (int i = 1; i < inputArray.length; i++) {
            // Add the current element to sum
            sum += inputArray[i];

            // If sum exceeds inputNumber, remove elements from the beginning until sum is reduced
            while (sum > inputNumber && start <= i - 1) {
                sum -= inputArray[start]; // Subtract the element at 'start' from sum
                start++; // Move the start index forward
            }

            // If sum matches the target number, print the subarray
            if (sum == inputNumber) {
                System.out.println("Continuous subarray of " + Arrays.toString(inputArray) + " whose sum is " + inputNumber + " is:");

                for (int j = start; j <= i; j++) {
                    System.out.print(inputArray[j] + " ");
                }

                System.out.println();
            }
        }
		
	}



	private static void SeparateZerosFromNonZeros() {
		// Define the input array
        int[] inputArray = {12, 0, 7, 0, 8, 0, 3};

        // Initialize a counter to track the position of non-zero elements
        int counter = 0;
        
        // Traverse the array from left to right
        for (int i = 0; i < inputArray.length; i++) {
            // If the current element is non-zero
            if (inputArray[i] != 0) {
                // Move non-zero element to the position indicated by counter
                inputArray[counter] = inputArray[i];

                // Increment the counter
                counter++;
            }
        }

        // Fill remaining positions in the array with zeros
        while (counter < inputArray.length) {
            inputArray[counter] = 0;
            counter++;
        }

        // Print the modified array where all zeros are at the end
        System.out.println("Array after moving zeros to the end: " + Arrays.toString(inputArray));
		
	}



	private static void PairsOfElementsInArray() {
		  // Define the input array
        int[] inputArray = {4, 6, 5, -10, 8, 5, 20};
        
        // Define the target sum
        int inputNumber = 10;

        // Sort the array to facilitate the two-pointer approach
        Arrays.sort(inputArray);

        System.out.println("Pairs of elements whose sum is " + inputNumber + " are:");

        // Initializing two pointers: one at the beginning and one at the end of the array
        int i = 0; // First index
        int j = inputArray.length - 1; // Last index

        // Iterate until the two pointers meet
        while (i < j) {
            // Calculate the sum of the current pair
            int sum = inputArray[i] + inputArray[j];

            // If the sum matches the target number, print the pair
            if (sum == inputNumber) {
                System.out.println(inputArray[i] + " + " + inputArray[j] + " = " + inputNumber);
                
                // Move both pointers inward to check further pairs
                i++;
                j--;
            }
            // If the sum is smaller than the target, move the left pointer to a larger number
            else if (sum < inputNumber) {
                i++;
            }
            // If the sum is greater than the target, move the right pointer to a smaller number
            else {
                j--;
            }
        }
		
	}



	private static void MultiplicationOfArrayElement() {
		int arr[] = {10,20,30,40, 50};
		int length = arr.length;
		int mul = 1;
		for(int i=0;i<length ;i++) {
			mul = mul * arr[i];
		}
		System.out.println("mul of array element " + mul); 
	}



	private static void MostFrequentElementProgram() {
		  // Define the input array
        int[] inputArray = { 4, 5, 8, 7, 4, 7, 6, 7 };

        // Create a HashMap to store elements as keys and their occurrences as values
        HashMap<Integer, Integer> elementCountMap = new HashMap<>();

        // Iterate through the array and store element frequency in HashMap
        for (int num : inputArray) {
            elementCountMap.put(num, elementCountMap.getOrDefault(num, 0) + 1);
        }
        
        System.out.println("Frequency of element ==> "+elementCountMap);

        // Variables to track the most frequent element and its frequency
        int mostFrequentElement = inputArray[0]; // Default to first element
        int highestFrequency = 1; // Minimum possible frequency

        // Iterate through the HashMap to find the most frequent element
        for (Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
            if (entry.getValue() > highestFrequency) {
                mostFrequentElement = entry.getKey();
                highestFrequency = entry.getValue();
            }
        }

        // Display the input array
        System.out.println("Input Array: " + Arrays.toString(inputArray));

        // Display the most frequent element and its frequency
        if (highestFrequency > 1) {
            System.out.println("The most frequent element: " + mostFrequentElement);
            System.out.println("Its frequency: " + highestFrequency);
        } else {
            System.out.println("No frequent element. All elements are unique.");
        }
		
	}



	private static void Java_program_to_find_leaders_in_an_array() {
		// Define the input array
        int[] inputArray = {12, 9, 7, 14, 8, 6, 3};

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
		int[] arr = new int[str.length()];

		for (int i = 0; i < str.length(); i++) {
			arr[i] = Character.getNumericValue(str.charAt(i));
		}

		System.out.println(Arrays.toString(arr));
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
		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 4, 5, 6 };

		int[] mergedArray = new int[array1.length + array2.length];

		// Copy array1
		for (int i = 0; i < array1.length; i++) {
			mergedArray[i] = array1[i];
		}

		// Copy array2
		for (int i = 0; i < array2.length; i++) {
			mergedArray[array1.length + i] = array2[i];
		}

		System.out.println(Arrays.toString(mergedArray));
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
