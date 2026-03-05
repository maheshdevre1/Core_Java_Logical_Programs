package StringProgram;

import java.util.Arrays;

public class SortAStringInAscendingOrder {
	
	public static void main(String[] args) {
        String str = "java";
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        String sortedString = new String(ch);
        System.out.println("Sorted string in ascending order: " + sortedString);
    }
}
