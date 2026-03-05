package java8Program;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Map.Entry;

public class How_do_you_find_the_most_repeated_element_in_an_array {
    
    public static void main(String[] args) 
    {
        // Create a list of strings with some repeated elements
        List<String> listOfStrings = Arrays.asList(
            "Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil"
        );

        // Use Java Stream to group and count occurrences of each element in the list
        // groupingBy(Function.identity(), counting()) will return a Map with the element as key and its count as value
        Map<String, Long> elementCountMap = listOfStrings.stream()
                                                         .collect(Collectors.groupingBy(
                                                             Function.identity(), // Group by the element itself
                                                             Collectors.counting() // Count each occurrence
                                                         ));

        // Print the complete map showing element counts
        System.out.println(elementCountMap); 
        // Example Output: {Note Book=2, Pencil=2, Eraser=1, Pen=3}

        // Find the entry (key-value pair) with the highest count using max() and comparingByValue()
        Entry<String, Long> mostFrequentElement = elementCountMap.entrySet()
                                                                 .stream()
                                                                 .max(Map.Entry.comparingByValue()) // Find the max by value
                                                                 .get(); // Get the actual entry
        
        System.out.println(mostFrequentElement);

        // Print the most frequent element
        System.out.println("Most Frequent Element : " + mostFrequentElement.getKey());

        // Print the count of that most frequent element
        System.out.println("Count : " + mostFrequentElement.getValue());
    }

}
