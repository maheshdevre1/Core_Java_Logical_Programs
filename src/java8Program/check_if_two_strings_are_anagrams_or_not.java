package java8Program;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class check_if_two_strings_are_anagrams_or_not {
	
	public static void main(String[] args) 
    {
        // Define two strings to check for anagrams
        String s1 = "RaceCar";
        String s2 = "CarRace";
         
        // Convert the string into a stream of characters, convert to uppercase, sort them, and then join them back
        s1 = Stream.of(s1.split(""))  // Split string into individual characters
                   //.map(String::toUpperCase)  // Convert each character to uppercase for case-insensitive comparison
                   .sorted()  // Sort the characters alphabetically
                   .collect(Collectors.joining());  // Join them back into a sorted string
        
        System.out.println(s1);
         
        s2 = Stream.of(s2.split(""))
                  // .map(String::toUpperCase)
                   .sorted()
                   .collect(Collectors.joining());
        
        System.out.println(s2);
         
        // Check if both transformed strings are equal
        if (s1.equals(s2)) 
        {
            System.out.println("Two strings are anagrams");  // If sorted versions match, they are anagrams
        }
        else
        {
            System.out.println("Two strings are not anagrams");  // Otherwise, they are not anagrams
        }
    }

}
