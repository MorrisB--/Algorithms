import java.util.*;

public class SimpleArraySum {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int[] array = new int[keyboard.nextInt()];

		for (int i = 0; i < array.length; i++)
			array[i] = keyboard.nextInt();

		int total = 0;
		for (int i = 0; i < array.length; i++)
			total += array[i];

		System.out.print(total);

		keyboard.close();

	}
}