import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String value = keyboard.next();
        keyboard.close();
                
        if (value.isEmpty()) {
        	System.out.print(0);
        	return;
        }
        
        int wordCount = 1;
        
        for (int i = 0; i < value.length(); i++)
        	if (value.charAt(i) >= 65 && value.charAt(i) <= 90)
        		wordCount++;
        
        System.out.print(wordCount);

    }
}
