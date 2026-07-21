package AllDSA;
//find longest palindrone from input string
public class Prob2 {
	
	
	  // Function to check palindrome
    static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
	
    public static void main(String[] args) {
    	  String s = "babracecarad";
          String longest = "";
          // Generate all substrings
          for (int i = 0; i < s.length(); i++) {
        	  for (int j = i; j < s.length(); j++) {
        		   String sub = s.substring(i, j + 1);
        		   System.out.println("sub ==> "+ sub);
        		   
        		   if (isPalindrome(sub) && sub.length() > longest.length()) {
                       longest = sub;
                   }
        		   
        	  }
        	  
          }
          
          System.out.println("Longest Palindrome = " + longest);

	}
}
