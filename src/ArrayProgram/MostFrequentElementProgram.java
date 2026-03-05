package ArrayProgram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class MostFrequentElementProgram {

    public static void main(String[] args) {
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
}
