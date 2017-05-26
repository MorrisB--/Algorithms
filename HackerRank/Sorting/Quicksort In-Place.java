import java.util.Scanner;

public class Solution {

	public Solution() {
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Solution solution = new Solution();
		
		int size = keyboard.nextInt();
		int[] array = new int[size];
		
		for (int i = 0; i < size; i++)
			array[i] = keyboard.nextInt();
		
		solution.quicksort(array);
		keyboard.close();
	}
	
	public void quicksort(int[] array) {
		quicksort(array, 0, array.length - 1);
	}
	
	private void quicksort(int[] array, int location1, int location2) {

		if ((location2 - location1) >= 1) {
			int pivotLocation = partition(array, location1, location2);
			print(array);
			
			quicksort(array, location1, pivotLocation - 1);
			quicksort(array, pivotLocation + 1, location2);
		}
		
	}
	
	private int partition(int[] array, int from, int to) {
	
		int pivot = array[to];
		int wallLocation = from;
	
		for (int currentIndex = from; currentIndex < to; ++currentIndex)
			if (array[currentIndex] < pivot) {
				swap(array, wallLocation, currentIndex);
				wallLocation++;
			}
			
		swap(array, wallLocation, to);

		return wallLocation;
	}
	
	private void swap(int[] array, int location1, int location2) {
		int temp = array[location1];
		array[location1] = array[location2];
		array[location2] = temp;
	}

	private void print(int[] array) {

		for (int value : array)
			print(value);

		System.out.println("");
	}

	private void print(int value) {
		System.out.print(Integer.toString(value) + " ");
	}
}



