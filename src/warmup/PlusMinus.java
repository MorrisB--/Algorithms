package warmup;

import java.util.*;

public class PlusMinus {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int[] array = new int[keyboard.nextInt()];

		double positive = 0, negative = 0, zero = 0;
		for (int i = 0; i < array.length; i++) {

			array[i] = keyboard.nextInt();

			if (array[i] > 0)
				positive++;
			else if (array[i] < 0)
				negative++;
			else
				zero++;
		}

		keyboard.close();
		System.out.print(positive / array.length + "\n" + negative / array.length + "\n" + zero / array.length);

	}
}