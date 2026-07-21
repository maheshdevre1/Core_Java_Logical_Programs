package AllDSA;

import java.util.Arrays;

//Given an array arr[] of n integers and a target value, check if there exists a pair
//whose sum equals the target. This is a variation of the 2-Sum problem.
//Examples: 
//Input: arr[] = [0, -1, 2, -3, 1], target = -2
//Output: true
//Explanation: There is a pair (1, -3) with the sum equal to given target, 1 + (-3) = -2.
//Input: arr[] = [1, -2, 1, 0, 5], target = 0
//Output: false
//Explanation: There is no pair with sum equals to given target.

public class Demo {
	

	public static void main(String[] args) {
		int arr[] = {10, 3, 5, 6, 2};
		int newArray[] = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			int mul = 1;
			for(int j=0; j<arr.length; j++) {
				if(i!=j) {
				 mul = mul * arr[j];
				}
			}
			
			newArray[i] = mul;
		}
		
		for(int mu : newArray) {
			System.out.println( mu);
		}
	
		
		
		
	}

}
