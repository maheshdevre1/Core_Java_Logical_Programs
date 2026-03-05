package StringProgram;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicteWordInString {
	
	public static void main(String[] args) {
        String str = "java is a programming lan java is";
        String[] words = str.split(" ");

        // Use a HashMap to count word occurrences
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            word = word.toLowerCase(); // optional: to make it case-insensitive
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        System.out.println(wordCount);

        System.out.println("Duplicate words:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
            }
        }
    }

}
