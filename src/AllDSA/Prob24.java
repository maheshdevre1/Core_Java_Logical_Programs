package AllDSA;
//https://leetcode.com/problems/jump-game-ii/
public class Prob24 {
	   public int jump(int[] nums) {

	        int jumps = 0;
	        int currentEnd = 0;
	        int farthest = 0;

	        for (int i = 0; i < nums.length - 1; i++) {

	        	  // Calculate the new position we can reach
	            int newReach = i + nums[i];

	            // Find the farthest position manually
	            if (newReach > farthest) {
	                farthest = newReach;
	            }
	            // We have reached the end of our current jump
	            if (i == currentEnd) {

	                jumps++;
	                currentEnd = farthest;
	            }
	        }

	        return jumps;
	    }

	    public static void main(String[] args) {

	        int[] nums = {2, 3, 1, 1, 4};

	        Prob24 p = new Prob24();

	        System.out.println(p.jump(nums));
	    }

}
