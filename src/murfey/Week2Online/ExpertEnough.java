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
			
			// How many queries?
			int[] queries = new int[keyboard.nextInt()];

			// Filling the query array
			for (int j = 0; j < queries.length; j++)
				queries[j] = keyboard.nextInt();
			
			// Running the data
			for (int j = 0; j < queries.length; j++) {

				int count = 0, location = -1;
				for (int k = 0; k < databaseSize; k++) {
					if (queries[j] >= Integer.parseInt(database[k][1])
							&& queries[j] < Integer.parseInt(database[k][2])) {
						count++;
						location = k;
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
