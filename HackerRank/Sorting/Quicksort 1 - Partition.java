import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	
	private static int[] array;
	
    public static void main(String[] args) {
		takeInput();
		sortAndPrint();
    }

	private static void takeInput() {
    	Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		array = new int[size];
		for (int i = 0; i < size; i++)
			array[i] = input.nextInt();
		
		input.close();
	}
	
	private static void sortAndPrint() {
		
		int pivot = array[0];
		ArrayList<Integer> leftArray = new ArrayList<Integer>();
		ArrayList<Integer> rightArray = new ArrayList<Integer>();
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] <= pivot)
				leftArray.add(array[i]);
			else
				rightArray.add(array[i]);
				
		}
		String result = leftArray.toString() + " " + pivot + " " + rightArray.toString();
				
		
		System.out.println(result.replace("[", "").replace("]", "").replace(",", ""));

		
	}
    
}
