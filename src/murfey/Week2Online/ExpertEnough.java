package murfey.Week2Online;

import java.util.Scanner;

public class ExpertEnough {
	public static void main(String[] args) {

		/*
		 * 
		 * 
		 * Step 3:
		 * 
		 * Loop for queries Test query Output results
		 */
		Scanner keyboard = new Scanner(System.in);
		int testCases = keyboard.nextInt();

		// Going through each test case
		for (int i = 0; i < testCases; i++) {
			int databaseSize = keyboard.nextInt();

			String[][] database = new String[databaseSize][3];

			// Filling the database
			for (int j = 0; j < databaseSize; j++) {
				database[j][0] = keyboard.next();
				database[j][1] = keyboard.next();
				database[j][2] = keyboard.next();
			}
		}

		keyboard.close();
	}

}
