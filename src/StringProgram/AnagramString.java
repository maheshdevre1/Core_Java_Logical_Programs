package StringProgram;

import java.util.Arrays;

public class AnagramString {
	public static void main(String[] args) {
		String str1= "riyam";
		String str2 = "ayir";
		
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

}
