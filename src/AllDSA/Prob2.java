package AllDSA;
//find longest palindrone from input string
public class Prob2 {
     public static void main(String[] args) {
    	String s = "babracecarad";
        String longest = "";
        // Generate all substrings
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String sub = s.substring(i, j + 1);
                // Check whether substring is palindrome
                int left = 0;
                int right = sub.length() - 1;
                boolean isPalindrome = true;
                while (left < right) {
                    if (sub.charAt(left) != sub.charAt(right)) {
                        isPalindrome = false;
                        break;
                    }
                    left++;
                    right--;
                }
                // Check longest palindrome
                if (isPalindrome && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }
        System.out.println("Longest Palindrome = " + longest);

	}
}
