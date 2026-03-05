package StringProgram;

public class DecodeStringManual {
	 public static void main(String[] args) {
	        String input = "3[a]2[bc]";
	        String result = "";
	        int i = 0;

	        while (i < input.length()) {
	            char ch = input.charAt(i);

	            // Step 1: If it's a number, store it
	            if (ch >= '0' && ch <= '9') {
	                int count = ch - '0'; // Get the repeat count
	                i = i+2; // Skip the digit and '['
	                String repeatStr = "";

	                // Step 2: Get the string inside brackets
	                while (input.charAt(i) != ']') {
	                    repeatStr += input.charAt(i);
	                    i++;
	                }

	                // Step 3: Repeat the string and add to result
	                for (int j = 0; j < count; j++) {
	                    result = result + repeatStr;
	                }
	            }

	            i++; // Move to the next character
	        }

	        System.out.println(result); // Output: aaabcbc
	    }
}
