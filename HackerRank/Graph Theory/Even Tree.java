package graph_theory;

import java.util.*;

public class EvenTree {

	public static void main(String[] args) {

		int tree[];
		int count[];

		Scanner keyboard = new Scanner(System.in);

		int N = keyboard.nextInt();
		int M = keyboard.nextInt();

		tree = new int[N];
		count = new int[N];
		Arrays.fill(count, 1);

		for (int i = 0; i < M; i++) {
			int u1 = keyboard.nextInt();
			int v1 = keyboard.nextInt();

			tree[u1 - 1] = v1;

			count[v1 - 1] += count[u1 - 1];

			int root = tree[v1 - 1];

			while (root != 0) {
				count[root - 1] += count[u1 - 1];
				root = tree[root - 1];
			}
		}

		int counter = -1;
		for (int i = 0; i < count.length; i++)
			if (count[i] % 2 == 0)
				counter++;

		keyboard.close();
		System.out.print(counter);

	}

}