package warmup;

import java.util.*;

public class AVeryBigSum {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int[] array = new int[keyboard.nextInt()];

		long total = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = keyboard.nextInt();
			total += array[i];
		}

		keyboard.close();
		System.out.println(total);

	}
}