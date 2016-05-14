package warmup;

import java.util.*;

public class Staircase {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int height = keyboard.nextInt();

		for (int i = 1; i <= height; i++) {
			for (int j = height - i; j > 0; j--)
				System.out.print(" ");
			for (int k = i; k > 0; k--)
				System.out.print("#");
			System.out.println();
		}

		keyboard.close();

	}
}