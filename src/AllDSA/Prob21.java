package AllDSA;

import java.util.Arrays;

//https://leetcode.com/problems/rotate-array/description/
//Input: nums = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]
//Explanation:
//rotate 1 steps to the right: [7,1,2,3,4,5,6]
//rotate 2 steps to the right: [6,7,1,2,3,4,5]
//rotate 3 steps to the right: [5,6,7,1,2,3,4]
public class Prob21 {
	
	 public void rotate(int[] nums, int k) {

	        int n = nums.length;

	        // If k is greater than array length
	   //     k = k % n;
	        System.out.println("k ==> "+ k);

	        // Step 1: Reverse entire array
	        reverse(nums, 0, n - 1); //[7, 6, 5, 4, 3, 2, 1]

	        // Step 2: Reverse first k elements
	        reverse(nums, 0, k - 1); //[5, 6, 7, 4, 3, 2, 1]

	        // Step 3: Reverse remaining elements
	        reverse(nums, k, n - 1); // [5, 6, 7, 1, 2, 3, 4]
	    }

	    public void reverse(int[] nums, int start, int end) {

	        while (start < end) {

	            int temp = nums[start];
	            nums[start] = nums[end];
	            nums[end] = temp;

	            start++;
	            end--;
	        }
	    	

	    }
	public static void main(String[] args) {
		
		int nums[] = {1,2,3,4,5,6,7};
		int k = 3;
		Prob21 p = new Prob21();
		System.out.println("Before rotation: " + Arrays.toString(nums));
		p.rotate(nums, k);
		System.out.println("After rotation:  " + Arrays.toString(nums));
		
	}

}
