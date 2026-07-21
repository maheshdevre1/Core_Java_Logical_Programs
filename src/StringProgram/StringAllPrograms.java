package StringProgram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringAllPrograms {

	public static void main(String[] args) {
		// split string input = mahesh$deore output mahesh deore
//		frequency_of_string();
//		freuency_of_word();
//		find_1st_non_repeating_and_repeating_character_from_string();
//		find_1st_non_repeating_and_repeating_word_from_list_string();
//		find_the_duplicate_words_and_their_number_of_occurrences();
		//reverse_of_string();
//		check_string_is_palimdrome_or_not();
//		Anagram_of_string();
//		count_character_in_the_string();
//		count_number_of_white_spaces_in_the_string();
//		remove_white_spaces_from_string();
//		Java_Program_to_Find_the_Largest_and_Smallest_Word();
//		sort_the_string_in_ascending_and_descending_order();
		
		//count_the_total_number_of_punctuation_characters_exists_in_a_String();
		//count_the_total_number_of_vowels_and_consonantsin_a_string();
		//find_all_subsets_of_a_string();
	    //find_the_longest_repeating_sequence_in_a_string();
//	    String str = "acbdfghybdf";
//		String lrs = "";
//		int n = str.length();
//		for (int i = 0; i < n; i++) {
//			for (int j = i + 1; j < n; j++) {
//				// Checks for the largest common factors in every substring
//				String x = lcp(str.substring(i, n), str.substring(j, n));
//				// If the current prefix is greater than previous one
//				// then it takes the current one as longest repeating sequence
//				if (x.length() > lrs.length())
//					lrs = x;
//			}
//		}
//		System.out.println("Longest repeating sequence: " + lrs);
	//	find_all_the_permutations_of_a_string();
//		String str = "ABC";
//		int len = str.length();
//		System.out.println("All the permutations of the string are: ");
//		generatePermutation(str, 0, len);
//		replace_lowercase_characters_with_upper_case_and_vice_versa();
		//replace_the_spaces_of_a_string_with_a_specific_character();
	   	//determine_whether_one_string_is_a_rotation_of_another();
		//find_maximum_and_minimum_occurring_character_in_a_string();
        //separate_the_Individual_Characters_from_a_String();
		swap_two_string_variables_without_using_third_or_temp_variable();
	}

	private static void swap_two_string_variables_without_using_third_or_temp_variable() {
		String str1 = "Good ", str2 = "morning ";
		System.out.println("Strings before swapping: " + str1 + " " + str2);

		// Concatenate both the string str1 and str2 and store it in str1
		str1 = str1 + str2;
		// Extract str2 from updated str1
		str2 = str1.substring(0, (str1.length() - str2.length()));
		// Extract str1 from updated str1
		str1 = str1.substring(str2.length());
		
	

		System.out.println("Strings after swapping: " + str1 + " " + str2);	
	}

	private static void separate_the_Individual_Characters_from_a_String() {
		 String string = "characters ";  
		  
	        //Displays individual characters from given string  
	        System.out.println("Individual characters from given string: ");  
	  
	        //Iterate through the string and display individual character  
	        for(int i = 0; i < string.length(); i++){  
	            System.out.print(string.charAt(i) + " ");  
	        }
	}

	private static void find_maximum_and_minimum_occurring_character_in_a_string() {
		String str = "grass is greener on the other side";
		int[] freq = new int[str.length()];
		char minChar = str.charAt(0), maxChar = str.charAt(0);
		int i, j, min, max;

		// Converts given string into character array
		char string[] = str.toCharArray();

		// Count each word in given string and store in array freq
		for (i = 0; i < string.length; i++) {
			freq[i] = 1;
			for (j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ' && string[i] != '0') {
					freq[i]++;

					// Set string[j] to 0 to avoid printing visited character
					string[j] = '0';
				}
			}
		}

		// Determine minimum and maximum occurring characters
		min = max = freq[0];
		for (i = 0; i < freq.length; i++) {

			// If min is greater than frequency of a character
			// then, store frequency in min and corresponding character in minChar
			if (min > freq[i] && freq[i] != '0') {
				min = freq[i];
				minChar = string[i];
			}
			// If max is less than frequency of a character
			// then, store frequency in max and corresponding character in maxChar
			if (max < freq[i]) {
				max = freq[i];
				maxChar = string[i];
			}
		}

		System.out.println("Minimum occurring character: " + minChar);
		System.out.println("Maximum occurring character: " + maxChar);
		
	}

	private static void determine_whether_one_string_is_a_rotation_of_another() {
		String str1 = "abcde", str2 = "deabc";

		if (str1.length() != str2.length()) {
			System.out.println("Second string is not a rotation of first string");
		} else {
			// Concatenate str1 with str1 and store it in str1
			str1 = str1.concat(str1);
			// Check whether str2 is present in str1
			System.out.println(str1.indexOf(str2));

			if (str1.indexOf(str2) != -1)
                System.out.println("Second string is a rotation of first string");
			else
				System.out.println("Second string is not a rotation of first string");
		}
	}

	private static void replace_the_spaces_of_a_string_with_a_specific_character() {
		String string = "Once in a blue moon";
		char ch = '-';

		// Replace space with specific character ch
		string = string.replace(' ', ch);

		System.out.println("String after replacing spaces with given character: ");
		System.out.println(string);
	}

	private static void replace_lowercase_characters_with_upper_case_and_vice_versa() {
		  String str = "Hello World 123";

	        StringBuilder result = new StringBuilder();

	        for (char ch : str.toCharArray()) {
	            if (Character.isLowerCase(ch)) {
	                result.append(Character.toUpperCase(ch));
	            } else if (Character.isUpperCase(ch)) {
	                result.append(Character.toLowerCase(ch));
	            } else {
	                result.append(ch); // keep numbers/symbols same
	            }
	        }

	        System.out.println("Output: " + result.toString());
		
	}

	// Function for generating different permutations of the string
	public static void generatePermutation(String str, int start, int end) {
		// Prints the permutations
		if (start == end - 1)
			System.out.println(str);
		else {
			for (int i = start; i < end; i++) {
				// Swapping the string by fixing a character
				str = swapString(str, start, i);
				// Recursively calling function generatePermutation() for rest of the characters
				generatePermutation(str, start + 1, end);
				// Backtracking and swapping the characters again.
				str = swapString(str, start, i);
			}
		}
	}
	
	// Function for swapping the characters at position I with character at position
		// j
		public static String swapString(String a, int i, int j) {
			char[] b = a.toCharArray();
			char ch;
			ch = b[i];
			b[i] = b[j];
			b[j] = ch;
			return String.valueOf(b);
		}

	
	private static String lcp(String s, String t) {
		int n = Math.min(s.length(), t.length());
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) != t.charAt(i)) {
				return s.substring(0, i);
			}
		}
		return s.substring(0, n);
		
	}

	private static void find_all_subsets_of_a_string() {
		String str = "FUN";  
        int len = str.length();  
        int temp = 0; 
        //Total possible subsets for string of size n is n*(n+1)/2  
        String arr[] = new String[len*(len+1)/2];  
  
        //This loop maintains the starting character  
        for(int i = 0; i < len; i++) {  
            //This loop adds the next character every iteration for the subset to form and add it to the array  
            for(int j = i; j < len; j++) {  
                arr[temp] = str.substring(i, j+1);  
                temp++;  
            }  
        }  
  
        //This loop prints all the subsets formed from the string.  
        System.out.println("All subsets for given string are: ");  
        for(int i = 0; i < arr.length; i++) {  
            System.out.println(arr[i]);  
        }  
	}

	private static void count_the_total_number_of_vowels_and_consonantsin_a_string() {

		// Counter variable to store the count of vowels and consonant
		int vCount = 0, cCount = 0;

		// Declare a string
		String str = "This is a really simple sentence";

		// Converting entire string to lower case to reduce the comparisons
		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			// Checks whether a character is a vowel
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				// Increments the vowel counter
				vCount++;
			}
			// Checks whether a character is a consonant
			else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				// Increments the consonant counter
				cCount++;
			}
		}
		System.out.println("Number of vowels: " + vCount);
		System.out.println("Number of consonants: " + cCount);
		
	}

	private static void count_the_total_number_of_punctuation_characters_exists_in_a_String() {
		        // Stores the count of punctuation marks
				int count = 0;
				String str = "He said, 'The mailman loves you.' I heard it with my own ears.";
				for (int i = 0; i < str.length(); i++) {
					// Checks whether given character is punctuation mark
					if (str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.'
							|| str.charAt(i) == '?' || str.charAt(i) == '-' || str.charAt(i) == '\'' || str.charAt(i) == '\"'
							|| str.charAt(i) == ':') {
						count++;
					}
				}
				System.out.println("The number of punctuations exists in the string is: " + count);

	}

	private static void sort_the_string_in_ascending_and_descending_order() {
		 String str = "java";
	        char[] ch = str.toCharArray();
	        Arrays.sort(ch);
	        StringBuilder reversedString = new StringBuilder(new String(ch));
	        reversedString.reverse();
	        System.out.println("Sorted string in descending order: " + reversedString.toString());

	}

	private static void Java_Program_to_Find_the_Largest_and_Smallest_Word() {
		String input = "Java is a powerful programming language";

		// Split the string into words
		String[] words = input.split(" ");

		String smallest = words[0];
		String largest = words[0];

		for (String word : words) {
			if (word.length() < smallest.length()) {
				smallest = word;
			}
			if (word.length() > largest.length()) {
				largest = word;
			}
		}

		System.out.println("Smallest word: " + smallest);
		System.out.println("Largest word: " + largest);
	}

	private static void remove_white_spaces_from_string() {
		String str = "java is opp";
		String newString = "";
		
		String removeWhiteSpaces = str.replaceAll("\\s+", "");
		System.out.println("removeWhiteSpaces ==> "+removeWhiteSpaces);
		char ch[] = str.toCharArray();
		for (char c : ch) {
			if (c != ' ') {
				newString = newString + c;
			}
        }
		System.out.println("remove white spaces from string ==> " + newString);

	}

	private static void count_number_of_white_spaces_in_the_string() {
		String str = " java is opp  ";

		char ch[] = str.toCharArray();
		int count = 0;
		for (char one : ch) {
			if (one == ' ') {
				count++;
			}

		}
		System.out.println("Number of white spaces ==> "+count);
	}

	private static void count_character_in_the_string() {
		String s = "java";

		char ch[] = s.toCharArray();
		int count = 0;
		for (char one : ch) {
			count++;
		}
		System.out.println("charcter in string ==> "+count);

	}

	private static void Anagram_of_string() {
		String str1= "silent";
		String str2 = "listen";
		
		char c1[] = str1.toCharArray();
		char c2[] = str2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		boolean b = Arrays.equals(c1, c2);
		
		if(b==true) {
			System.out.println("Equals");
		}else {
			System.out.println("Not equal");
		}
	}

	private static void check_string_is_palimdrome_or_not() {
		String str = "121";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (rev.equals(str)) {
			System.out.println("Given string is palindrome");
		} else {
			System.out.println("not palindrome");
		}
		
	}

	private static void reverse_of_string() {
		String str = "java";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) { // Fixed the loop condition
			rev = rev + str.charAt(i); // Append characters in reverse order
		}
		System.out.println("Reversed String: " + rev); // Print the reversed string

	}

	private static void find_the_duplicate_words_and_their_number_of_occurrences() {
		String str = "java is  framework java is a oop concept is";
		String[] words = str.split(" ");
		Map<String, Integer> map = new HashMap<>();
		for (String word : words) {
			if (map.containsKey(word)) {
			map.put(word.toLowerCase(), map.get(word.toLowerCase()) + 1);
			} else {
				map.put(word.toLowerCase(), 1);
			}

		}

		Set<String> wordsInString = map.keySet();

		for (String word : wordsInString) {
			if (map.get(word) > 1) {
				System.out.println(word + " wordcount is " + map.get(word));
			}

		}

	}

	private static void find_1st_non_repeating_and_repeating_word_from_list_string() {
		String str = "java java is is a programming language";
		String[] words = str.split(" ");
		Map<String, Integer> map = new HashMap<>();
		for (String word : words) {
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}
		}

		System.out.println(map);

		for (String word : words) {
			if (map.get(word) > 1) {
				System.out.println("1st repeating character ==> " + word);
				break;
			}
		}

		for (String word : words) {
			if (map.get(word) == 1) {
				System.out.println("1st non repeating character ==> " + word);
				break;
			}
		}

	}

	private static void find_1st_non_repeating_and_repeating_character_from_string() {
		String str = "mahesh";
		char convertTochar[] = str.toCharArray();

		Map<Character, Integer> map = new HashMap<>();

		for (char c : convertTochar) {
			if (map.containsKey(c)) {
				int value = map.get(c) + 1;
				map.put(c, value);
			} else {
				map.put(c, 1);
			}
		}

		// find 1st non repeating from string
		for (char c : convertTochar) {
			if (map.get(c) == 1) {
				System.out.println("First Non repeating character ==>  " + c);
				break;
			}
		}
		// find 1st repeating character from string
		for (char c : convertTochar) {
			if (map.get(c) > 1) {
				System.out.println("First  repeating character ==>  " + c);
				break;
			}
		}

	}

	private static void freuency_of_word() {
		String str = "java is  framework Java is a Oop concept oop is";
		String[] words = str.split(" ");
		Map<String, Integer> map = new HashMap<>();
		for (String word : words) {
			if (map.containsKey(word)) {
				map.put(word.toLowerCase(), map.get(word.toLowerCase()) + 1);
			} else {
				map.put(word.toLowerCase(), 1);
			}
		}

		System.out.println(map);

		Set<String> words1 = map.keySet();

		for (String w : words1) {
			if (map.get(w) > 1) {
				System.out.println(w + " wordcount is " + map.get(w));
			}
		}

	}

	private static void frequency_of_string() {
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
