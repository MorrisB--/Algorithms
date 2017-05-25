package murfey;

import java.util.Arrays;

public class FinalQuestions {
	static int[] memo;

	public static void main(String[] args) {
		int[] digits = new int[4];
		permute(digits, 0, 8, 15);
		System.out.println("---------------------------------");
		memo = new int[1000];

		int i = 20;
		System.out.println(fibonacci(i));
		i = 24;
		System.out.println(fibonacci(i));
		i = 5;
		System.out.println(fibonacci(i));

		int[] a = { 2, 3, 3, -4, 5, -2, -4, -5, 5, -6, 5, 4, -3, 5, -6, 7, -6, 5, -4, 2, -5, 6, -4, 3 };
		System.out.println(largestContinuousSum(a));
	}

	// If the array sum equals the sum passed in return true
	public static boolean validSolution(int[] a, int sum) {
		int total = 0;

		for (int i = 0; i < a.length; i++)
			total += a[i];

		if (total == sum)
			return true;

		return false;
	}

	public static void display(int[] a) {

		int[] b = new int[a.length];
		System.arraycopy(a, 0, b, 0, a.length);
		Arrays.sort(b);

		for (int i = 0; i < b.length; i++)
			System.out.print(b[i]);

	}

	public static void permute(int[] digits, int pos, int base, int val) {
		// are we done?
		if (pos >= digits.length) {
			if (validSolution(digits, val) == true) {
				display(digits);
			}
			return;
		}
		for (int i = 0; i < base; i++) {
			digits[pos] = i;
			if (promising(digits, pos)) {
				permute(digits, pos + 1, base, val);
			}
		}
		return;
	}

	public static boolean promising(int[] d, int pos) {
		int total = 0;
		for (int i = 0; i < d.length; i++)
			total += d[i];

		if (pos >= total)
			return false;

		return true;
	}

	/*
	 * write the recursive fibonacci method - use memoization if you can, do not
	 * write the method iteratively!
	 */
	public static long fibonacci(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	/*
	 * return the largest summation of an integer array. the array may contain
	 * negative values
	 */

	public static int largestContinuousSum(int[] a) {

		int tempSum = a[0], max = a[0];

		for (int i = 1; i < a.length; i++) {
			// grab the largest
			tempSum = Math.max(tempSum + a[i], a[i]);
			// set the largest
			max = Math.max(max, tempSum);
		}

		return max;
	}

}
