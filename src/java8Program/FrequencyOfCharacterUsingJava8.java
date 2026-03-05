package java8Program;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharacterUsingJava8 {
	
	public static void main(String[] args) {
        // Initializing the input string.
        String inputString = "Java Concept Of The Day";

        // This line creates a Map (key-value pairs) to store each character as the key 
        // and its frequency (count) as the value.
        Map<Character, Long> charCountMap = 
            inputString
                .chars() // Converts the input string into an IntStream of character Unicode values.
                .mapToObj(c -> (char) c) // Converts each int (Unicode) value back to its corresponding character.
                .collect(Collectors.groupingBy( 
                    Function.identity(), // Groups by each unique character.
                    Collectors.counting() // Counts how many times each character appears.
                ));

        // Printing the resulting map, where each key is a character and its value is the count.
        System.out.println(charCountMap);
    }

}
