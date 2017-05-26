import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

    	int[] array = readData();
    	
    	int[] dataCount = new int[100];
    	dataCount = fillDataCount(dataCount);
    	dataCount = countData(array, dataCount);
    	printResult(dataCount);
    }
    
    private static int[] readData() {
    	
    	Scanner keyboard = new Scanner(System.in);
    	int[] array = new int[keyboard.nextInt()];
    	
    	for (int i = 0; i < array.length; i++) 
    		array[i] = keyboard.nextInt();
    	
    	keyboard.close();
    	return array;
   
    }
    
    private static int[] fillDataCount(int[] dataCount) {
    	for (int i = 0; i < 100; i++)
    		dataCount[i] = 0;
    	return dataCount;
    }
    
    private static int[] countData(int[] array, int[] dataCount) {
    
    	for (int i = 0; i < array.length; i++)
    		dataCount[array[i]]++;
    	
    	return dataCount;
    }
    
    private static void printResult(int[] dataCount) {
    	System.out.println(Arrays.toString(dataCount).replaceAll("\\[|\\]", "").replace(",", ""));
    }
    
}