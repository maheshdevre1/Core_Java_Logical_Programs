package ArrayProgram;

//Java program to find the second largest element in an array using only the main method

public class FindSecondLargestElementInArray {
	public static void main(String[] args) {
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
		
		System.out.println("firstLargest ==> "+firstLargest);
		System.out.println("secondLargest ==> "+secondLargest);

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
}
