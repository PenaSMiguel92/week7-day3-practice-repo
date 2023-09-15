import java.util.*;

public class PracticeQuestion_4 {
	/*
	 * Prompt: Given an array of integers, nums, and a target, write
	 * 		an algorithm which return the indices of the two numbers
	 * 		in the array which add up to the target. You can assume
	 * 		that each input will have a single solution. Additionally
	 * 		you may not use the same element twice.
	 * 
	 * Example:
	 * 		INPUT: nums = [2,7,11,15], target=9
	 * 		OUTPUT: [0,1] (because nums[0] is 2, and nums[1] is 7 || nums[0] + nums[1] == 9)
	 */

	public int[] uniqueSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		int[] ans = new int[2];
		for (int i = 0; i < nums.length; i++) {
			int comp = target-i;
			if (!map.containsKey(comp))
				map.put(comp, i);
			else if (map.containsKey(nums[i])) {
				ans[0] = map.get(nums[i]);
				ans[1] = i;
			}
				
		}
		
		return ans;
	}
	 
}
