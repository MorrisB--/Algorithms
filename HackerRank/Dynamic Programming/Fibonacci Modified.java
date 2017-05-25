package dynamic_programming;

import java.math.*;
import java.util.*;

public class FibonacciModified {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		BigInteger a = new BigInteger(keyboard.next());
		BigInteger b = new BigInteger(keyboard.next());
		int n = keyboard.nextInt();
		BigInteger nth = new BigInteger("-1");

		for (int i = 3; i <= n; i++) {
			nth = a.add(b.multiply(b));
			a = b;
			b = nth;
		}

		keyboard.close();
		System.out.print(nth);

	}
}