// Java program to find leaders in an array

package ArrayProgram;

import java.util.Arrays;

public class LeadersInArray {
    public static void main(String[] args) {
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
}
