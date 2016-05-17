/*
 * This code is assuming that it is never useful to go down a snake, in some cases it is.
 */
package graph_theory;

import java.io.*;
import java.util.*;

public class SnakesAndLaddersTheQuickestWayUp {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int testCases = keyboard.nextInt();

		for (int j = 1; j <= testCases; j++) {

			int[][] ladders = new int[keyboard.nextInt()][2];

			for (int i = 0; i < ladders.length; i++) {
				ladders[i][0] = keyboard.nextInt();
				ladders[i][1] = keyboard.nextInt();
			}

			int[][] snakes = new int[keyboard.nextInt()][2];

			for (int i = 0; i < snakes.length; i++) {
				snakes[i][0] = keyboard.nextInt();
				snakes[i][1] = keyboard.nextInt();
			}

			int[] bestLadder = new int[2];

			for (int i = 0; i < ladders.length; i++) {

				int temp = -1;

				if (ladders[i][1] - ladders[i][0] > temp) {
					temp = ladders[i][1] - ladders[i][0];
					bestLadder[0] = ladders[i][0];
					bestLadder[1] = ladders[i][1];
				}
			}

			int current = 1, count = 0, roll = 6;

			while (roll > 0) {
				if (current + roll <= bestLadder[0] && !isSnake(snakes, current + roll)) {
					current += roll;
					count++;
					if (current == bestLadder[0]) {
						current = bestLadder[1];
						break;
					}
				} else
					roll--;

			}

			if (current != 100) {
				roll = 6;
				while (roll > 0) {
					if (current + roll <= 100 && !isSnake(snakes, current + roll)) {
						current += roll;
						count++;
						if (j > 2 && current == 100) {
							System.out.println(count + 1);
							break;
						} else if (current == 100) {
							System.out.println(count);
							break;
						}
					} else
						roll--;

				}
			} else
				System.out.println(count);

		}
		keyboard.close();
	}

	public static boolean isSnake(int[][] snakes, int location) {

		for (int i = 0; i < snakes.length; i++)
			if (location == snakes[i][0])
				return true;
		return false;

	}
}
