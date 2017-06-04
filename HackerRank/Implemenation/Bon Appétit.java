import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
    	
    	Scanner keyboard = new Scanner(System.in);
    	int[] array = new int[keyboard.nextInt()];
    	int didntEat = keyboard.nextInt();
    	
    	for (int i = 0; i < array.length; i++)
    		array[i] = keyboard.nextInt();
    	
    	int charged = keyboard.nextInt();
    	int actual = 0;
    	keyboard.close();
    	
    	for (int i = 0; i < array.length; i++)
    		if (i == didntEat)
    			continue;
    		else
    			actual += array[i];
    		
        actual /= 2;
    	System.out.print(actual == charged ? "Bon Appetit" : charged - actual);
    }
}