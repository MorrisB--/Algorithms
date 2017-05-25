package warmup;

import java.util.*;

public class TimeConversion {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		String amPM = keyboard.next();
		String military = "";

		if (amPM.substring(8).equals("AM") && amPM.substring(0, 2).equals("12"))
			military = "00" + amPM.substring(2, 8);
		else if (amPM.substring(8).equals("AM"))
			military = amPM.substring(0, 8);
		else if (amPM.substring(8).equals("PM") && amPM.substring(0, 2).equals("12"))
			military = amPM.substring(0, 8);
		else if (amPM.substring(8).equals("PM"))
			military = Integer.parseInt(amPM.substring(0, 2)) + 12 + amPM.substring(2, 8);

		keyboard.close();
		System.out.print(military);
	}
}