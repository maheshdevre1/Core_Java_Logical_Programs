package AllDSA;
//Given a string s, the task is to find the maximum consecutive repeating character in the string.
//Note: We do not need to consider the overall count, but the count of repeating that appears in one place.
//Examples: 
//Input: s = "geeekk"
//Output: e
//Explanation: character e comes 3 times consecutively which is maximum.
//Input: s = "aaaabbcbbb"
//Output: a
//Explanation: character a comes 4 times consecutively which is maximum.

public class Prob13 {
	
	public static void main(String[] args) {
		String s = "geeekk";
        char result = s.charAt(0);
        int count = 1;
        int maxCount = 1;
        for (int i = 1; i < s.length(); i++) {
            // Check current character with previous character
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                // Different character found, reset count
                count = 1;
            }
            // Check whether current count is maximum
            if (count > maxCount) {
                maxCount = count;
                result = s.charAt(i);
            }
        }
        System.out.println("Character: " + result);
        System.out.println("Count: " + maxCount);
		
	}

}
