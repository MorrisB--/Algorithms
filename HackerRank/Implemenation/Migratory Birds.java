import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];
        for(int types_i=0; types_i < n; types_i++){
            types[types_i] = in.nextInt();
        }
        // your code goes here
        
        int[] typesCount = {0, 0, 0, 0, 0};
        
        for (int i = 0; i < types.length; i++)
        	typesCount[types[i] - 1] += 1;
        
        int count = 0;
        for (int i = 0; i < typesCount.length; i++)
        	if (typesCount[i] > typesCount[count]) // this also covers same count different ID
        		count = i;
        
        System.out.print(count + 1); // +1 for the ID
    }
}
