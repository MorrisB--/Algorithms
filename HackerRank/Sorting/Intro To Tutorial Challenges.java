package sorting;

import java.util.*;

public class IntroToTutorialChallenges {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int value = keyboard.nextInt();
		int[] array = new int[keyboard.nextInt()];

		for (int i = 0; i < array.length; i++) {
			array[i] = keyboard.nextInt();
			if (array[i] == value) {
				System.out.print(i);
				break;
			}
		}

		keyboard.close();
	}
}