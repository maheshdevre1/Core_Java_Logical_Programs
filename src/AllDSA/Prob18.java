package AllDSA;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class Prob18 {
	public int removeDuplicates(int[] nums) {
		int k = 0;
		Set<Integer> set = new HashSet<>();
		for(int i=0; i<nums.length; i++) {
//			if(nums[i]!=nums[k-1]) { //initail k value 1
//				nums[k] = nums[i];
//				k++;
//			}
			
			set.add(nums[i]);
			System.out.println(set);
		}
		
		for(int i : set) {
			k++;
		}
		return k;
		

	}

	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		
        Prob18 p = new Prob18();
        int k = p.removeDuplicates(nums);
        System.out.println(k);
	}

}
