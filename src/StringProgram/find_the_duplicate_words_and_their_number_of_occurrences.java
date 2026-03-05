package StringProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class find_the_duplicate_words_and_their_number_of_occurrences {
	public static void main(String[] args) {
		String str = "java is  framework java is a oop concept is";
		String [] words = str.split(" ");
		Map<String, Integer> map = new HashMap<>();
		for(String word : words) {
			if(map.containsKey(word)) {
				map.put(word.toLowerCase(), map.get(word.toLowerCase()) + 1);
			}else {
				map.put(word.toLowerCase(), 1);
			}
			
		}
		
		Set<String> wordsInString = map.keySet();
		
		for(String word : wordsInString) {
			if(map.get(word)>1) {
				System.out.println(word  + " wordcount is " + map.get(word));
			}
			
		}
	}

}
