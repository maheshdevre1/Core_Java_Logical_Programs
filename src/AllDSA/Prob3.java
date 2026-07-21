package AllDSA;

//Given an array arr[] of n integers and a target value, check if there exists a pair
//whose sum equals the target. This is a variation of the 2-Sum problem.
//Examples: 
//Input: arr[] = [0, -1, 2, -3, 1], target = -2
//Output: true
//Explanation: There is a pair (1, -3) with the sum equal to given target, 1 + (-3) = -2.
//Input: arr[] = [1, -2, 1, 0, 5], target = 0
//Output: false
//Explanation: There is no pair with sum equals to given target.

public class Prob3 {

	public static void main(String[] args) {
		int arr[] = {0, -1, 2, -3, 1};
	    int target = -2;
		boolean found = false;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]+arr[j]==target) {
					found = true;
					break;
				}
			}
			
			if(found) {
				break;
			}
		}
		
		System.out.println(found);

	}

}
