package StringProgram;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfString {

	public static void main(String[] args) {
		String input = "hello java";
		Map<Character, Integer> map = new HashMap<>();
		char[] chars = input.toCharArray();

		for (char ch : chars) {
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				int value = map.get(ch);
				map.put(ch, value + 1);
			}
		}
		System.out.println(map);
	}
}
