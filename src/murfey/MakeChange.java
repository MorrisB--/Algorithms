package murfey;

import java.util.Arrays;

public class MakeChange {
	public static void main(String[] args) {

		System.out.println("Running...");

		int[] coins = new int[30];
		for (int i = 0; i < coins.length; i++)
			coins[i] = (int) (Math.random() * 1000);

		// Making sure a penny is in there
		coins[0] = 1;

		int val = (int) (Math.random() * 100);
		int mC = minCoins(val, coins);

		System.out.println(Arrays.toString(coins));
		System.out.println(mC + " coins needed for " + val);

	}

	public static int minCoins(int val, int[] coins) {

		if (val == 0)
			return 0;

		int c = 0;
		int minCoins = val;

		for (int i = 0; i < coins.length; i++)
			if (coins[i] <= val) {
				c = minCoins(val - coins[i], coins);
				c += 1;
				if (c < minCoins)
					minCoins = c;
			}

		return minCoins;
	}

}
