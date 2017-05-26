import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        long resultMax = -1;
        long resultMini = Long.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) { // keeping track of the value to skip
        	long tempValue = 0;

        	for (int j = 0; j < arr.length; j++) { // adding all the values
        		if (j == i)
        			continue;
        		
        		tempValue += arr[j];
        	}
        	
        	resultMax = tempValue > resultMax ? tempValue : resultMax;
        	resultMini = tempValue < resultMini ? tempValue : resultMini;

        }
        
        System.out.println(resultMini + " " + resultMax);
    }
}
