import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
			array.add(in.nextInt());
		
		int count = 0;
		for (int i = 0; i < array.size(); i++) {
			int oldVal = array.remove(0);
			i--;
			for (int j = 0; j < array.size(); j++) {
				if (array.get(j) == oldVal) {
					array.remove(j);
					count++;
					break;
				}
			}
		}
		
		System.out.print(count);
	}
}
