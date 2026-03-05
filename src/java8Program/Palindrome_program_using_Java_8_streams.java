package java8Program;

import java.util.stream.IntStream;

public class Palindrome_program_using_Java_8_streams {

    public static void main(String[] args) 
    {
        // Input string to check for palindrome
        String str = "ROTATOR";
        int len = str.length();

        // Check if the string is a palindrome using Java 8 streams
        // IntStream.range(0, str.length()/2) creates a stream of indices from 0 to middle of the string
        // .noneMatch(...) checks if there's any index 'i' where characters at position 'i' and 'length-i-1' don't match
        // If none of them mismatch (i.e., noneMatch is true), then the string is a palindrome
        boolean isItPalindrome = IntStream.range(0, len/ 2)
                                          .noneMatch(i -> str.charAt(i) != str.charAt(len - i - 1));

        // If the boolean is true, it means the string is a palindrome
        if (isItPalindrome)
        {
            System.out.println(str + " is a palindrome");
        }
        else
        {
            System.out.println(str + " is not a palindrome");
        }
    }

}
