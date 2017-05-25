package implementation;

import java.util.*;

public class FindDigits {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int testCases = keyboard.nextInt();
		for (int i = 1; i <= testCases; i++) {
			int number = keyboard.nextInt();
			String stringNumber = number + "";
			int count = 0;
			for (int j = 0; j < stringNumber.length(); j++)
				if (stringNumber.charAt(j) != '0')
					if (number % Integer.parseInt(stringNumber.charAt(j) + "") == 0)
						count++;

			System.out.println(count);
		}

		keyboard.close();
	}
}