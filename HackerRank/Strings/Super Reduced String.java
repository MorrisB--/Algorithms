import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

    	StringBuilder word = new StringBuilder(new Scanner(System.in).next());
		
    	int i = 0;
    	while (word.length() >= 2) {
    		if ((word.charAt(i) + "").equals(word.charAt(i + 1) + "")) {
    			word.replace(i, i + 2, "");
    			i = 0;
    			continue;
    		}
    		if (i == word.length() - 2)
    			break;
    		i++;
    	}
		System.out.println(word.length() == 0 ? "Empty String" : word);

    	
    }
}