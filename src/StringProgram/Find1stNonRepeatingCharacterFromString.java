package StringProgram;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Find1stNonRepeatingCharacterFromString {
	
	public static void main(String[] args) {
		String str = "mahesh";
		char convertTochar[] = str.toCharArray();
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(char c : convertTochar) {
			if(map.containsKey(c)) {
				int value = map.get(c) + 1;
				map.put(c, value);
			}else {
				map.put(c, 1);
			}
		}
		
		
		//find 1st non repeating from string
		for(char c : convertTochar) {
			if(map.get(c) == 1 ) {
				System.out.println("First Non repeating character ==>  "+c);
				break;
			}
		}
		//find 1st repeating character from string
		for(char c : convertTochar) {
			if(map.get(c) > 1 ) {
				System.out.println("First  repeating character ==>  "+c);
				break;
			}
		}
		
		
	}
	
	
}