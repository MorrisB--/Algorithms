package implementation;

import java.util.*;

public class UtopianTree {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int cases = keyboard.nextInt();
		for (int i = 1; i <= cases; i++) {
			int height = 1;
			int cycles = keyboard.nextInt();
			for (int j = 1; j <= cycles; j++) {
				if (j % 2 == 1)
					height += height;
				else
					height += 1;
			}
			System.out.println(height);
		}

		keyboard.close();

	}
}