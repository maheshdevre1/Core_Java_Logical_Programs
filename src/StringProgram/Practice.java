package StringProgram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//split string input = mahesh$deore output mahesh deore
//frequency of string
//freuency of word
//find 1st non-repeating character from string
//find 1st repeating character from string
//find 1st non-repeating word from list string
//find 1st repeating word from list string
//find_the_duplicate_words_and_their_number_of_occurrences
//reverse of string
//check string is palimdrome or not
//Anagram of string
//count character in the string
//count number of white spaces in the string
//remove white spaces from string
//Java Program to Find the Largest and Smallest Word
//sort the string in ascending and descending order

//****************************************************************************

//3) Java Program to count the total number of punctuation characters exists in a String
//4) Java Program to count the total number of vowels and consonants in a string
//7) Java Program to find all subsets of a string
//8) Java Program to find the longest repeating sequence in a string
//9) Java Program to find all the permutations of a string
//11) Java Program to replace lower-case characters with upper-case and vice-versa
//12) Java Program to replace the spaces of a string with a specific character
//Java Program to determine whether one string is a rotation of another
//Java Program to find maximum and minimum occurring character in a string.
//Java Program to separate the Individual Characters from a String
//Java Program to swap two string variables without using third or temp variable.

public class Practice {
	public static void main(String[] args) {
		String s1 = "riya";
		//String s2 = "yairm";
		char ch [] = s1.toCharArray();
		
		//char ch1[] = s1.toCharArray();
		//char ch2[] = s2.toCharArray();
		Arrays.sort(ch);
		
		//String s = new String(ch);
		StringBuilder s = new StringBuilder(new String(ch));
		System.out.println(s.reverse());
		
		
		
		
		
	}
}
