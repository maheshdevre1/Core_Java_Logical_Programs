package AllDSA;

//https://leetcode.com/problems/jump-game/description/
//Input: nums = [2,3,1,1,4]
//Output: true
//Input: nums = [3,2,1,0,4]
//Output: false
public class Prob23 {

	public boolean canJump(int[] nums) {

		int maxReach = 0;

		for (int i = 0; i < nums.length; i++) {

			// If current index cannot be reached
			if (i > maxReach) {
				return false;
			}

			int newReach = i + nums[i];

			// Manually find maximum
			if (newReach > maxReach) {
				maxReach = newReach;
			}

			// Already reached the last index
			if (maxReach >= nums.length - 1) {
				return true;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		int[] nums = { 2, 3, 1, 1, 4 };

		Prob23 p = new Prob23();

		System.out.println(p.canJump(nums));
	}

}
