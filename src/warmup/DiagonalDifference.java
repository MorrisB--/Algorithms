package warmup;

import java.util.*;

public class DiagonalDifference {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int rowColumn = keyboard.nextInt();
		;
		int[][] array = new int[rowColumn][rowColumn];

		int diagonalDown = 0;
		int diagonalUp = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++)
				array[i][j] = keyboard.nextInt();

			diagonalDown += array[i][i];
			diagonalUp += array[i][array.length - (i + 1)];
		}

		keyboard.close();

		System.out.print(Math.abs(diagonalDown - diagonalUp));

	}
}