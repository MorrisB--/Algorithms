import java.util.Scanner;

public class Solution {

    static int solve(int pageCount, int destination){
    	// making it easier to calculate by adjusting pageCount
    	if (pageCount % 2 == 0)
    		pageCount += 1;
    	
    	// counting from the beginning
    	int start = 0;
    	for (int i = 0; i <= pageCount; i += 2) { 
    		if (i == destination || i == destination - 1)
    			break;
    		start += 1;
    	}
    	// counting from the end
    	int end = 0;
    	for (int i = pageCount; i >= 0; i -= 2) { 
    		if (i == destination || i - 1 == destination)
    			break;
    		end += 1;
    	}
    	
    	return start < end ? start : end;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
