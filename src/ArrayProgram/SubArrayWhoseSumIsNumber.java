// Java program to find a continuous subarray whose sum matches a given number

package ArrayProgram;

import java.util.Arrays;

public class SubArrayWhoseSumIsNumber {
    public static void main(String[] args) {
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
}
