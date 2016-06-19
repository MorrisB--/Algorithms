package murfey;

import java.util.Scanner;
import java.io.File;

public class Main {

	static int count = 1;

	public static void main(String[] args) throws Exception {
		Scanner inp = new Scanner(new File("inp.txt"));

		while (inp.hasNext()) {
			int x = inp.nextInt();
			int y = inp.nextInt();

			int a = x;
			int b = y;
			if (a > b) {
				int temp = b;
				b = a;
				a = temp;
			}
			int maxCycles = 0;

			for (int i = a; i <= b; i++) {
				int cycles = numCyclesIter(i);
				if (cycles > maxCycles) {
					maxCycles = cycles;
				}
			}
			System.out.println(x + " " + y + " " + maxCycles);
		}
	}

	public static int numCycles(int n) {

		if (n == 1)
			return 1;

		if (n % 2 == 0) {
			count++;
			return numCycles(n / 2);
		} else {
			count++;
			return numCycles(3 * n + 1);
		}
	}

	public static int numCyclesIter(int n) {
		count = 1;
		while (n != 1)
			n = numCycles(n);

		return count;
	}
}