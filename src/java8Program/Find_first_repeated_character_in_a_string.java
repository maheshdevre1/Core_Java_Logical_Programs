package java8Program;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Import necessary classes
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find_first_repeated_character_in_a_string {
 
 public static void main(String[] args) {
     
     // Input string where we want to find the first repeated character.
     // All whitespace characters are removed using replaceAll, and the string is converted to lowercase.
     String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();

     // Create a Map to store the count of each character using Java Streams.
     // 1. Convert the string into an array of characters (split by "").
     // 2. Group by character (Function.identity()).
     // 3. Count the occurrences of each character using Collectors.counting().
     Map<String, Long> charCountMap = 
         Arrays.stream(inputString.split(""))
               .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
     
     // Print the map to see the frequency of each character.
     System.out.println(charCountMap);
     
     // Find the first repeated character:
     // 1. Stream the entry set of the map.
     // 2. Filter entries with value > 1 (i.e., repeated characters).
     // 3. Map to the character key.
     // 4. Use findFirst() to get the first repeated character (based on the map's iteration order).
     // 5. Call get() to extract the value from the Optional.
     String firstRepeatedChar = charCountMap.entrySet()
                                            .stream()
                                            .filter(entry -> entry.getValue() > 1)
                                            .map(entry -> entry.getKey())
                                            .findFirst()
                                            .get();
     
     // Print the first repeated character.
     System.out.println(firstRepeatedChar);
 }
}
