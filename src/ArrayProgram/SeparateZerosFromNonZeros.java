// Java program to separate zeros from non-zeros by moving all zeros to the end

package ArrayProgram;

import java.util.Arrays;

public class SeparateZerosFromNonZeros {
    public static void main(String[] args) {
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
}
