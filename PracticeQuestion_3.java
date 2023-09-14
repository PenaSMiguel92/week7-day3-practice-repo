import java.util.*;
public class PracticeQuestion_3 {
	/*
	 * Prompt: Write an algorithm that takes a string and returns 
	 * 		the length of the longest substring without repeating characters.
	 * 
	 * Example:
	 * 		Input: "abcabcbb"
	 * 		Output: 3 (The answer is "abc", with the length of 3.)
	 * 
	 * 		Input: "acccabdefcaebcafcbdad"
	 * 		Output: 6 (The answer is "cabdef", with the length of 6.)
	 */
	public String longestSubstring(String in) {
		Set<Character> uniqueChars = new HashSet<>();
		String ans = "";
		int maxLength = Integer.MIN_VALUE;
		char[] charArr = in.toCharArray();
		int start = 0;
		int end = charArr.length - 1;
		do {
			int length = 0;
			for (int i = start; i <= end; i++) {
				if (!uniqueChars.add(charArr[i])) {
					if (length > maxLength) {
						maxLength = length;
						ans = in.substring(start, i);
					}

					uniqueChars.clear();
					break;
				} else {
					length++;
				}
			}
			if (length > maxLength) {
				maxLength = length;
				ans = in.substring(start, end+1);
			}
			start++;

		} while (start != end);

		return ans;
	}
	
	public static void main(String[] args) {
		PracticeQuestion_3 pq3 = new PracticeQuestion_3();
		System.out.println(pq3.longestSubstring("abcabcbb"));
		System.out.println(pq3.longestSubstring("acccabdefcaebcafcbdad"));
		System.out.println(pq3.longestSubstring(
				"aaabbbbccccddddeeeeffffffabcdefghabcabcdabcdgefgggggbbbbcccddddeeeeessssssddddfffffgggsdfsefdvsdvsdvsdsegegsdsaadsda"));
		System.out.println(pq3.longestSubstring("aaabbbbccccddddeeeeffffffabcdefghabcabcdabcdgefgggggbbbbcccddddeeeeessssssddddfffffgggsdfsefdvsdvsdvsdsegegsdsaadsdaasdfghjklertyuiop"));
	}
}
