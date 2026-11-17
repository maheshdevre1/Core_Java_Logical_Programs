package AllDSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//https://leetcode.com/problems/majority-element/description/
//Input: nums = [3,2,3]
//Output: 3
//Input: nums = [2,2,1,1,1,2,2]
//Output: 2
public class Prob20 {

	public int majorityElement(int[] nums) {
		
		Map<Integer, Integer> map = new HashMap<>();
		for(int a : nums) {
			if(map.containsKey(a)) {
				map.put(a, map.get(a)+1);
			}else {
				map.put(a, 1);
			}
		}
		
		int k=nums[0];//frquent key
		int elementValue = 1;
		
		for(Entry<Integer, Integer> entry : map.entrySet()) {
			if(elementValue> entry.getValue()) {
				k = entry.getKey();
			}
		}
		
		return k;

	}
	
	public static void main(String[] args) {
		int nums[] = {2,2,1,1,1,2,2};
		Prob20 p = new Prob20();
		int k = p.majorityElement(nums);
		System.out.println(k);
	}

}
