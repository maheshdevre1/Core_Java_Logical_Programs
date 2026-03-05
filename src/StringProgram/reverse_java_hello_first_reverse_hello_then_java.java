package StringProgram;

public class reverse_java_hello_first_reverse_hello_then_java {
	 public static void main(String[] args) {
	        String str = "java hello";
	        
	        // Split the string into words
	        String[] words = str.split(" ");
	        
	        // Print each word in reverse order, starting from the last word
	        for (int i = words.length - 1; i >= 0; i--) {
	            String word = words[i];
	            String reversedWord = "";

	            for (int j = word.length() - 1; j >= 0; j--) {
	                reversedWord += word.charAt(j);
	            }

	            System.out.println(reversedWord);
	        }
	    }

}
