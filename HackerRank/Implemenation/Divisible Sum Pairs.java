import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] array = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            array[a_i] = in.nextInt();
        }
        // write your code here
                
		int count = 0;
        for (int i = 0; i < array.length; i++) {
        	for (int j = i + 1; j < array.length - 1; j++) {
        		if (!(i < j))
        			break;
        		if ((array[i] + array[j]) % k == 0)
        			count++;
        	
        	}
        }
        
        System.out.print(count);
    }
}
