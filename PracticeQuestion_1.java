import java.util.*;

public class PracticeQuestion_1 {
	/*
	 * Prompt: Given a array containing 'n' distinct numbers from a range of
	 * 		1 to n (1, 2, 3, ..., n) find the one missing number. 
	 * 
	 * Example:
	 * 		INPUT: [3,7,1,2,8,4,5]
	 * 		OUTPUT: 6
	 * 
	 * 		INPUT: [13,3,7,11,4,6,2,10,9,5,8,1]
	 * 		OUTPUT: 12
	 * 
	 * Pseudocode:
	 * FUNCTION findMissingNumber(arr: ARRAY of INTEGERS) -> INTEGER:
	 * 		SET sortedArr to Arrays.sort(arr)
	 * 
	 * 		FOR i FROM 1 TO length of sortedArr
	 * 			IF i NOT EQUAL to sortedArr[i - 1]
	 * 				RETURN i
	 */
	
	public int findMissingNumber(int[] nums) {
		Arrays.sort(nums);
		for (int i = 1; i <= nums.length; i++) {
			if (i != nums[i - 1])
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		PracticeQuestion_1 pq1 = new PracticeQuestion_1();

		System.out.println(pq1.findMissingNumber(new int[] { 3, 7, 1, 2, 8, 4, 5 }));
		System.out.println(pq1.findMissingNumber(new int[]{13, 3, 7, 11, 4, 6, 2, 10, 9, 5, 8, 1}));
	}
}
