import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

    	ArrayList<Integer> array = readInput();
    	array = quickSort(array);
    }
    
    private static ArrayList<Integer> readInput() {
    	
    	Scanner keyboard = new Scanner(System.in);
    	ArrayList<Integer> array = new ArrayList<Integer>();
    	
    	int size = keyboard.nextInt();
    	for (int i = 0; i < size; i++)
    		array.add(keyboard.nextInt());
    		
    	keyboard.close();
    	return array;
    	
    }
    
	private static ArrayList<Integer> quickSort(ArrayList<Integer> array) {
    	
    	if (array.size() == 1 || array.size() == 0)
    		return array;
    	
    	int pivot = array.get(0);
    	
    	ArrayList<Integer> leftArray = new ArrayList<Integer>();
    	ArrayList<Integer> rightArray = new ArrayList<Integer>();

    	for (int i = 1; i < array.size(); i++) {
    		if (array.get(i) <= pivot)
    			leftArray.add(array.get(i));
    		else
    			rightArray.add(array.get(i));
    	}
    	
    	leftArray = quickSort((ArrayList<Integer>) leftArray);
    	rightArray = quickSort((ArrayList<Integer>) rightArray);

    	leftArray.add(pivot);
    	leftArray.addAll(rightArray);
    	System.out.println(leftArray.toString().replace("[", "").replace("]", "").replace(",", ""));

    	return leftArray;
    }
}