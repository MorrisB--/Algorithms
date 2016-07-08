package murfey.Week2Online;

import java.util.Scanner;

public class ExpertEnough {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int testCases = keyboard.nextInt();

		// Going through each test case
		for (int i = 0; i < testCases; i++) {

			// Filling the database
			int databaseSize = keyboard.nextInt();
			String[][] database = new String[databaseSize][3];
			for (int j = 0; j < databaseSize; j++) {
				database[j][0] = keyboard.next();
				database[j][1] = keyboard.next();
				database[j][2] = keyboard.next();
			}

			// Running each query
			int queries = keyboard.nextInt();
			for (int k = 0; k < queries; k++) {

				int queryPrice = keyboard.nextInt();

				int count = 0;
				int location = -1;
				for (int l = 0; l < databaseSize; l++) {
					if (queryPrice > Integer.parseInt(database[l][1])
							&& queryPrice < Integer.parseInt(database[l][2])) {
						count++;
						location = l;
					}
				}

				if (count == 1)
					System.out.println(database[location][0]);
				else
					System.out.println("UNDETERMINED");

			}
		}

		keyboard.close();
	}

}
