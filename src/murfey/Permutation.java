package murfey;

public class Permutation {

	public static void main(String[] args) {

		// magic square 3x3
		int[] a = new int[9];
		permute(a, 0);

	}

	// checking to see if the board is valid
	public static boolean validSolution(int[] array){
		int sum = 0;
		for(int i=0;i<Math.sqrt(array.length); i++){
			sum += array[i];
			for(int j = 1; j < Math.sqrt(array.length);j++){
				int sum1 = 0;
				for(int k = 0; k<Math.sqrt(array.length);k++)
					sum1 += a[j*Math.sqrt(a.length)+k];
				if (sum1 != sum) return false;
				
			}
			for (int l =0;l<Math.sqrt(array.length);l++){
				int sum2=0;
				for (int m = 0 )
			}
		}
	}

	public static void permute(int[] array, int pos) {

		if (pos == array.length)
			if (validSolution(array))
				displaySolution(array);
		return;

		for (int i = 1; i <= array.length; i++) {
			array[pos] = i;
			if (promising(array, pos))
				permute(array, pos + 1);
		}
	}
}
