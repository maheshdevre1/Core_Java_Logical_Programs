package StringProgram;

public class StringMethodsDemo {

	 public static void main(String[] args) {

	        String str = "  Hello Java World!  ";
	        String str2 = "hello java world!";

	        // Returns the number of characters in the string
	  //      System.out.println(str.length());

	        // Returns the character at the specified index
	  //      System.out.println(str.charAt(4));

	        // Extracts substring between start (inclusive) and end (exclusive)
	 //       System.out.println(str.substring(2, 7));

	        // Compares two strings for exact equality (case-sensitive)
	 //       System.out.println(str.equals(str2));

	        // Compares two strings ignoring case differences
	 //       System.out.println(str.trim().equalsIgnoreCase(str2));

	        // Compares two strings lexicographically (case-sensitive)
	 //       System.out.println(str.compareTo(str2));

	        // Compares two strings lexicographically ignoring case
	     //   System.out.println(str.compareToIgnoreCase(str2));

	        // Converts all characters to uppercase
	    //    System.out.println(str.toUpperCase());

	        // Converts all characters to lowercase
	    //    System.out.println(str.toLowerCase());

	        // Removes whitespace from both ends
	    //    System.out.println(str.trim());

	        // Checks if the string begins with the given prefix
	     //   System.out.println(str.startsWith("  He"));

	        // Checks if the string ends with the given suffix
	     //  System.out.println(str.endsWith("ld!  "));

	        // Checks if the string contains the given sequence
	     //   System.out.println(str.contains("Java"));

	        // Returns index of the first occurrence of a substring
	     //   System.out.println(str.indexOf("Java"));

	        // Returns index of the last occurrence of a substring
	      // System.out.println(str.lastIndexOf('a'));

	        // Checks if the string is empty
	     //   System.out.println(str.isEmpty());

	        // Replaces all occurrences of one character or sequence with another
	      //  System.out.println(str.replace("Java", "Python"));

	        // Replaces all substrings matching a regex pattern
	      //  System.out.println(str.replaceAll("[AEIOUaeiou]", "*"));

	        // Splits the string into an array using a delimiter or regex
	        for (String word : str.trim().split(" ")) {
	           System.out.println(word);
	        }

	        // Concatenates the specified string to the end
	//        System.out.println(str.concat(" Let's code!"));

	        // Converts string into an array of characters
	        for (char c : str.toCharArray()) {
	    //        System.out.print(c + " ");
	        }
	       // System.out.println();

	        // Checks if the string matches the given regex
	     //   System.out.println(str.matches(".*Java.*"));

	        // Joins multiple strings with a specified delimiter
	       // System.out.println(String.join("-", "one", "two", "three"));

	        // Formats a string using format specifiers
	     //   System.out.println(String.format("Name: %s, Age: %d", "Mahesh", 25));

	        // Returns the canonical representation from the string pool
	        String s1 = new String("intern").intern();
	        String s2 = "intern";
	        //System.out.println(s1 == s2);

	        // Converts any object or value to a string
	        //System.out.println(String.valueOf(123));

	        // Repeats the string a given number of times (Java 11+)
	        //System.out.println("Hi ".repeat(3));

	        // Removes leading and trailing spaces (Unicode-aware)
	     //   System.out.println(str.strip());

	        // Removes whitespace only from the beginning
	        //System.out.println(str.stripLeading());

	        // Removes whitespace only from the end
	        //System.out.println(str.stripTrailing());

	        // Compares specific regions of two strings
	        //System.out.println(str.regionMatches(2, str2, 2, 5));

	        // Converts string to a byte array
	        for (byte b : str.getBytes()) {
	  //          System.out.print(b + " ");
	        }
	        //System.out.println();

	        // Returns a CharSequence from start to end
	        //System.out.println(str.subSequence(2, 7));
	    }
}

