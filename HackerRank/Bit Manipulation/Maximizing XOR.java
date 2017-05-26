import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

    	int[] data = getData();
    	calculateAndPrint(data);
    
    }
    
    private static int[] getData() {
    	Scanner keyboard = new Scanner (System.in);
    	
    	int[] data = new int[2];
    	data[0] = keyboard.nextInt();
    	data[1] = keyboard.nextInt();
    	keyboard.close();
    	
    	return data;
    }
    
    private static void calculateAndPrint(int[] data) {
    	int l = data[0];
    	int r = data[1];
    	
    	int result = -1;
    	for (int i = l; i <= r; i++) 
    		for (int j = l; j <= r; j++) 
    			result = (i ^ j) > result ? i ^ j : result;
    		
    	System.out.print(result);
    	
    }
}