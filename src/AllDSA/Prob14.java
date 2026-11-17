package AllDSA;
//Given two strings s and p, the task is to find the smallest substring in s that contains all characters of p, including duplicates. If no such substring exists, return "". If multiple substrings of the same length are found, return the one with the smallest starting index.

//Examples: 
//Input: s = "timetopractice", p = "toc"
//Output: toprac
//Explanation: "toprac" is the smallest substring in which "toc" can be found.
//Input: s = "zoomlazapzo", p = "oza"
//Output: apzo
//Explanation: "apzo" is the smallest substring in which "oza" can be found.

import java.util.HashMap;
import java.util.Map;

public class Prob14 {
	public static String smallestWindow(String s, String p) {
	if (s == null || p == null || s.length() < p.length()) {
        return "";
    }
    // Store required characters and their frequencies
    Map<Character, Integer> required = new HashMap<>();
    for (char ch : p.toCharArray()) {
        required.put(ch, required.getOrDefault(ch, 0) + 1);
    }
    System.out.println("required ==> "+ required);
    Map<Character, Integer> window = new HashMap<>();
    int left = 0;
    int matched = 0;
    int minLength = Integer.MAX_VALUE;
    System.out.println("minLength ==> "+ minLength);
    int startIndex = 0;
    for (int right = 0; right < s.length(); right++) {
        char rightChar = s.charAt(right);
        window.put(rightChar,
                window.getOrDefault(rightChar, 0) + 1);
        // Count this character only if it is still needed
        if (required.containsKey(rightChar)
                && window.get(rightChar) <= required.get(rightChar)) {
            matched++;
        }
        // We found all characters of p
        while (matched == p.length()) {
            int currentLength = right - left + 1;
            if (currentLength < minLength) {
                minLength = currentLength;
                startIndex = left;
            }
            char leftChar = s.charAt(left);
            window.put(leftChar, window.get(leftChar) - 1);
            // If removing this character makes window invalid
            if (required.containsKey(leftChar)
                    && window.get(leftChar) < required.get(leftChar)) {
                matched--;
            }
            left++;
        }
    }
    if (minLength == Integer.MAX_VALUE) {
        return "";
    }
    return s.substring(startIndex, startIndex + minLength);
}
public static void main(String[] args) {
    String s = "timetopractice";
    String p = "toct";
    System.out.println(smallestWindow(s, p));
}
}
