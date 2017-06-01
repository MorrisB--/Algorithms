import java.util.Scanner;

public class Solution {

    static int[] getRecord(int[] s){
    	int highestCount = -1;
    	int highestNumber = -1;
    	int lowestCount = -1;
    	int lowestNumber = Integer.MAX_VALUE;
    	
    	for (int i = 0; i < s.length; i++) {
    		if (s[i] > highestNumber) {
    			highestCount++;
    			highestNumber = s[i];
    		}
    		
    		if (s[i] < lowestNumber) {
    			lowestCount++;
    			lowestNumber = s[i];
    		}
    	}
    	
    	int[] result = {highestCount, lowestCount};
    	
    	return result; 
    	
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
