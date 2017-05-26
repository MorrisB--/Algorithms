import java.util.Scanner;

public class Solution {

    static int getTotalX(int[] arrayA, int[] arrayB){

    	int totalX = 0;
    	for (int x = 1; x <= 100; x++) {
    		for (int a = 0; a < arrayA.length; a++){
    			if (x % arrayA[a] != 0)
    				break;
    			else if (a == arrayA.length - 1) { // x mod all num in array == 0
    				for (int b = 0; b < arrayB.length; b++) {
    					if (arrayB[b] % x != 0)
    						break;
    					else if (b == arrayB.length - 1) // x mod all num in array == 0
    						totalX++;
    				}
    			}
    		}
    	}
    	
    	return totalX;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
    }
}
