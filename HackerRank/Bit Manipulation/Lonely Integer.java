import java.util.Collection;
import java.util.Hashtable;
import java.util.Scanner;

public class Solution {
     private static int lonelyInteger(int[] a) {
    	 
		Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
		
		for (int i = 0; i < a.length; i++) {
			if (table.get(a[i]) != null)
				table.remove(a[i]);
			else
				table.put(a[i], a[i]);
		}
		
		Collection<Integer> list = table.values();
		Object[] array = list.toArray();
        return Integer.parseInt(array[0].toString());
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(lonelyInteger(a));
    }

}
