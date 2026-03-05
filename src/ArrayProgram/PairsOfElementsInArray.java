// Java program to find pairs of elements in an array whose sum is equal to a given number

package ArrayProgram;

import java.util.Arrays;

public class PairsOfElementsInArray {
    public static void main(String[] args) {
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
}
