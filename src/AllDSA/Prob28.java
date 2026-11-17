package AllDSA;
//Given a string s, find the length of the longest substring without duplicate characters.
//Example 1:
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
//Example 2:
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.

public class Prob28 {
	  public int lengthOfLongestSubstring(String s) {
		  int maxLength = 0;
		  for(int i=0; i<s.length(); i++) {
			  String temp = "";
			  for(int j=i; j<s.length(); j++) {
				  char ch = s.charAt(j);
				  if(temp.indexOf(ch) != -1) {
					  break;
				  }
				  temp = temp+ch;
				  if(temp.length()> maxLength) {
					  maxLength = temp.length();
				  }
				  
			  }
			  
		  }
		  return maxLength;
	        
	  }
	 
	 public static void main(String[] args) {
		String s = "pwwkew";
		Prob28 p = new Prob28();
		int longest = p.lengthOfLongestSubstring(s);
		System.out.println(longest);
	}

}
