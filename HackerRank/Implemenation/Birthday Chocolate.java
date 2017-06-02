import java.util.Scanner;

public class Solution {

    static int solve(int arraySize, int[] array, int day, int month) {

    	int count = 0;
    	for (int i = 0; i < arraySize - month + 1 || arraySize == 1; i++) { // looping through the bar
    		int temp = 0;
    		
    		for (int j = i; j < i + month; j++)
    			temp += array[j];
    		
    		if (temp == day && arraySize != 1)
    			count++;
    		else if (temp == day && arraySize == 1)
    			return ++count;
    		
    	}
    
    	return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}
