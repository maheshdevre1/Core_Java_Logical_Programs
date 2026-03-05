package ArrayProgram;

import java.util.Arrays;

public class CheckTwoGivenArrayAreEqualOrNot {
	
	public static void main(String[] args) {
		int a1[] = {2,3,4};
		int a2[] = {1,2,3};
		System.out.println(Arrays.equals(a1, a2));
		int a3[] = {2,3,4};
		System.out.println(Arrays.equals(a1, a3));
	}
}
