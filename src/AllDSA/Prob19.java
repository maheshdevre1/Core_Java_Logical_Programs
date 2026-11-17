package AllDSA;

import java.util.Arrays;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/
//Input: nums = [1,1,1,2,2,3]
//Output: 5, nums = [1,1,2,2,3,_]
//Input: nums = [0,0,1,1,1,1,2,3,3]
//Output: 7, nums = [0,0,1,1,2,3,3,_,_]
public class Prob19 {
	
	
    public int removeDuplicates(int[] nums) {
    	  if (nums.length <= 2) {
              return nums.length;
          }

          int k = 2;

          for (int i = 2; i < nums.length; i++) {

              if (nums[i] != nums[k - 2]) {
                  nums[k] = nums[i];//1 12
                  k++;
              }
          }

          return k;
        
    }
	public static void main(String[] args) {
		int nums[] = {1,1,1,2,2,3};
		Prob19 p = new Prob19();
		int k = p.removeDuplicates(nums);
//		System.out.println(Arrays.toString(nums));
		System.out.println(k);
	}
	

}
