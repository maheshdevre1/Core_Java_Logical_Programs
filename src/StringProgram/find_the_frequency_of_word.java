package StringProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class find_the_frequency_of_word {
	
	public static void main(String[] args) {
		String str = "java is  framework Java is a Oop concept oop is";
		String[] words = str.split(" ");
		Map<String,Integer> map = new HashMap<>();
		for(String word : words) {
			if(map.containsKey(word)) {
				map.put(word.toLowerCase(), map.get(word.toLowerCase()) + 1);
			}else {
				map.put(word.toLowerCase(), 1);
			}
		}
		
		System.out.println(map);
		
		Set<String> words1 = map.keySet();
		
		for(String w : words1) {
			if(map.get(w)>1) {
				System.out.println(w +" wordcount is " + map.get(w));
			}
		}
	}

}
