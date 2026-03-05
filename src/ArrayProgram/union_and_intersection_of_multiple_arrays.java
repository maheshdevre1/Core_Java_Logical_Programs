
package ArrayProgram;

import java.util.Arrays;
import java.util.HashSet;

public class union_and_intersection_of_multiple_arrays {

	  public static void main(String[] args) {
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
}
