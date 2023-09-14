
public class PracticeQuestion_2 {
	/*
	 * Prompt: Write an algorithm that rotates elements of an array to the right 
	 * by a given number of steps. 
	 * 
	 * For example: 
	 * Given the array [1, 2, 3, 4, 5] and 2 steps, the result should be [4, 5, 1, 2, 3].
	 * 
	 * Pseudocode:
	 * FUNCTION rotateArray(arr: ARRAY of INTEGERS, k: INTEGER) -> ARRAY of INTEGERS:
	 * 		SET n to arr length
	 * 		
	 * 		// Take mod to handle cases where k > length of arr
	 * 		SET k = k MOD length of arr
	 * 
	 * 		// If k is 0, then no rotation is needed
	 * 		IF k IS 0:
	 * 			RETURN arr
	 * 
	 * 		// Create a temporary array to store last k elements
	 * 		SET temp = new ARRAY of size k
	 * 		FOR i FROM 0 TO k-1:
	 *         SET temp[i] = arr[length of arr - k + i]
	 *         
	 *		// Shift original array to the right by k positions
	 *      FOR i FROM length of arr - 1 DOWN TO k:
	 *      	SET arr[i] = arr[i - k]
	 *                 
	 * 		// Copy the temporary array at the beginning of the original array
	 * 		FOR i FROM 0 TO k-1:
	 * 			SET arr[i] = temp[i]
	 *
	 * 		RETURN arr
	 */
	public int[] rotateArray(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		if (k == 0)
			return arr;

		int[] temp = new int[k];
		for (int i = 0; i < k; i++) {
			temp[i] = arr[n - k + i];
		}

		for (int i = n - 1; i >= k; i--) {
			arr[i] = arr[i - k];
		}

		for (int i = 0; i < k; i++) {
			arr[i] = temp[i];
		}

		return arr;
	}
	
	public static void main(String[] args) {
		PracticeQuestion_2 pq2 = new PracticeQuestion_2();
		System.out.println(pq2.rotateArray(new int[] {1, 2, 3, 4, 5}, 2));
	}
}
