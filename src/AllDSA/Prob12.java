	package AllDSA;
//Given a string s having lowercase characters, find the length of the longest substring without repeating characters. 
//Examples:
//Input: s = "geeksforgeeks"
//Output: 7 
//Explanation: The longest substrings without repeating characters are "eksforg” and "ksforge", with lengths of 7.
//Input: s = "aaa"
//Output: 1
//Explanation: The longest substring without repeating characters is "a"
//Input: s = "abcdefabcbb"
//Output: 6
//Explanation: The longest substring without repeating characters is "abcdef".
public class Prob12 {
	
	

	public static void main(String[] args) {
		    String s = "geeksforgeeks";
	        int maxLength = 0;
	        String longest = "";
	        for (int i = 0; i < s.length(); i++) {
	            String temp = "";
	            for (int j = i; j < s.length(); j++) {
	                char ch = s.charAt(j);
	                // If character already exists, stop
	                if (temp.indexOf(ch) != -1) {
	                    break;
	                }
	                // Add character
	                temp = temp + ch;
	                // Check if current substring is longest
	                if (temp.length() > maxLength) {
	                    maxLength = temp.length();
	                    longest = temp;
	                }
	            }
	        }
	        System.out.println("Longest substring: " + longest);
	        System.out.println("Longest length: " + maxLength);
	}

}
