package sorting;

import java.io.*;
import java.util.*;

public class RunningTimeOfAlgorithms {

	public static void insertionSortPart2(int[] ar) {

		int shifts = 0;
		for (int i = 1; i < ar.length; i++) {
			for (int j = i; j > 0; j--)
				if (ar[j] < ar[j - 1]) {
					ar[j - 1] = ar[j - 1] + ar[j];
					ar[j] = ar[j - 1] - ar[j];
					ar[j - 1] = ar[j - 1] - ar[j];
					shifts++;
				}
		}
		System.out.print(shifts);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++)
			ar[i] = in.nextInt();
		insertionSortPart2(ar);

	}

	private static void printArray(int[] ar) {
		for (int n : ar)
			System.out.print(n + " ");
		System.out.println("");
	}
}