package implementation;

import java.util.*;

public class AngryProfessor {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int testCases = keyboard.nextInt();

		for (int i = 1; i <= testCases; i++) {
			int students = keyboard.nextInt();
			int threshold = keyboard.nextInt();
			int onTime = 0;
			for (int j = 1; j <= students; j++)
				if (keyboard.nextInt() <= 0)
					onTime++;
			if (onTime >= threshold)
				System.out.println("NO");
			else
				System.out.println("YES");

		}
		keyboard.close();

	}
}