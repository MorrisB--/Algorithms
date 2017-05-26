import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int houseBegin = in.nextInt();
        int houseEnd = in.nextInt();
        int appleTreeLoc = in.nextInt();
        int orangeTreeLoc = in.nextInt();
        int appleCount = in.nextInt();
        int orangeCount = in.nextInt();
        int[] appleDropLen = new int[appleCount];
        for(int apple_i=0; apple_i < appleCount; apple_i++){
            appleDropLen[apple_i] = in.nextInt();
        }
        int[] orangeDropLen = new int[orangeCount];
        for(int orange_i=0; orange_i < orangeCount; orange_i++){
            orangeDropLen[orange_i] = in.nextInt();
        }
        
        int appleHits = 0;
        for (int i = 0; i < appleCount; i++)
        	if (appleTreeLoc + appleDropLen[i] >= houseBegin
        			&& appleTreeLoc + appleDropLen[i] <= houseEnd)
        		appleHits++;
        
        int orangeHits = 0;
        for (int i = 0; i < orangeCount; i++)
        	if (orangeTreeLoc + orangeDropLen[i] >= houseBegin
        			&& orangeTreeLoc + orangeDropLen[i] <= houseEnd)
        		orangeHits++;
        
        System.out.println(appleHits + "\n" + orangeHits);
        
    }
}
