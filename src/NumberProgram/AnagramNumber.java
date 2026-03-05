package NumberProgram;

import java.util.Arrays;

public class AnagramNumber {
	public static void main(String[] args) {
		int num1= 12345;
		int num2 = 54321;
		
		//convert number in string 
		String num1String = String.valueOf(num1);
		String num2String = String.valueOf(num2);
		
		char num1Array[] = num1String.toCharArray();
		char num2Array[] = num2String.toCharArray();
		
		Arrays.sort(num1Array);
		Arrays.sort(num2Array);
		
		boolean b = Arrays.equals(num1Array, num2Array);
		if(b == true) {
			System.out.println("No is anagram");
		}else {
			System.out.println("No is not anagram");
		}
		
		
	}

}
