package murfey;

import java.util.Arrays;

public class MakeChange {

	static int count = 0;

	public static void main(String[] args) {

		System.out.println("Running...");

		int[] coins = new int[10];
		for (int i = 0; i < coins.length; i++)
			coins[i] = (int) (Math.random() * 200);

		// Making sure a penny is in there
		// coins[0] = 1;

		int val = (int) (Math.random() * 100);
		int mC = minCoins(val, coins);

		System.out.println(Arrays.toString(coins));
		System.out.println(mC + " coins needed for " + val);
		System.out.println("Number of iterations " + count);
		
	}

	public static int minCoins(int val, int[] coins) {
		
		count++;

		if (val == 0)
			return 0;

		int c = 0;
		int minCoins = val;

		for (int i = 0; i < coins.length; i++)
			if (coins[i] <= val) {

				c = minCoins(val - coins[i], coins);
				if (c < 0)
					continue;
				c += 1;
				if (c < minCoins)
					minCoins = c;
			}

		// This is like a flag
		if (minCoins > val)
			return -1;

		return minCoins;
	}

}
