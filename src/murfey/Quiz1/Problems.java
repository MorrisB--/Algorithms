package murfey.Quiz1;

public class Problems {
	public static void main(String[] args) {

		/*
		 * Problem 2, assuming for(int i = 0; i is actually for (int i = 0; i <=
		 * n; i++), the typo made this unsolvable.
		 * 
		 * n would run n + 24 + n*n times, or n^2 times. Big O is n^2
		 */

	}

	/*
	 * Problem 3
	 * 
	 * Method is Big O(n^2)
	 * 
	 * 
	 * Expected case/Worst case
	 * 
	 * Bubble-sort: Big O(n^2) / Big O(n^2)
	 * 
	 * Merge-sort: Big O(n log(n)) / Big O(n log(n))
	 * 
	 * Quick-sort: Big O(n log(n)) / Big O(n^2)
	 */
	public static boolean findTwo(int[] A, int x) {
		for (int i = 0; i < A.length; i++)
			for (int j = i + 1; j < A.length; j++)
				if (A[i] + A[j] == x)
					return true;
		return false;
	}
	
	/*
	 * Problem 4
	 * 
	 * FALSE
	 */
	
	/*
	 * Problem 5
	 * 
	 *     [4, 2, 6, 5, 7, 1, 3, 8]
	 *   [4, 2, 6, 5]    [7, 1, 3, 8]
	 *  [4. 2] [6, 5]   [7, 1] [3, 8]
	 * [4] [2] [6] [5] [7] [1] [3] [8]
	 * 
	 * mergeSort will be called 14 times
	 */
}