import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        int count = 0;
        for (int i = 0; i < s.length(); i += 3) {
        	if (!(s.charAt(i) + "").equals("S"))
        		count++;
        	if (!(s.charAt(i + 1) + "").equals("O"))
        		count++;
        	if (!(s.charAt(i + 2) + "").equals("S"))
        		count++;
        }
        
        System.out.print(count);
    }
}
