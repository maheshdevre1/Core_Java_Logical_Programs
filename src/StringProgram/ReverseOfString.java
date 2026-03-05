package StringProgram;

public class ReverseOfString {
	 public static void main(String[] args) {
	        String str = "java";
	        String rev = "";
	        for (int i = str.length() - 1; i >= 0; i--) { // Fixed the loop condition
	            rev = rev + str.charAt(i); //Append characters in reverse order
	        }
	        System.out.println("Reversed String: " + rev); // Print the reversed string
	    }

}
