package StringProgram;

import java.util.Arrays;

public class SortAStringInDescendingOrder {
	
	public static void main(String[] args) {
        String str = "java";
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        StringBuilder reversedString = new StringBuilder(new String(ch));
        reversedString.reverse();
        System.out.println("Sorted string in descending order: " + reversedString.toString());
    }
}
