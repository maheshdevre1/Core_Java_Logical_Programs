package ArrayProgram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class MergeTwoArraysAndRemoveDuplicatesProgram {

    public static void main(String[] args) {
        // Define two input arrays
        int[] arrayA = {7, -5, 3, 8, -4, 11, -19, 21};
        int[] arrayB = {6, 13, -7, 0, 11, -4, 3, -5};

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
}
