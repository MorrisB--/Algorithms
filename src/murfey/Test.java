package murfey;

public class Test {
	public static void main(String[] args) {

		int[] coins = { 25, 17, 1 };
		int val = 35;
		int mC = minCoins(val, coins);

		System.out.println(mC + " coins needed.");

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
