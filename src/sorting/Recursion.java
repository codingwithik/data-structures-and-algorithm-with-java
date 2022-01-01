package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Recursion {

	public static void main(String[] args) {
		
		List<Integer> score = new ArrayList<>();
		score.add(25);
		score.add(100);
		score.add(50);
		score.add(50);
		
		//System.out.println(iterativeFactorial(9));
		//System.out.println(recursiveFactorial(3));
		
		System.out.println(levelUp(3, score) );
	}
	
	public static int recursiveFactorial(int num) {
		
		if(num == 0)
			return 1;
		
		return num * recursiveFactorial(num - 1);
	}
	
	public static int iterativeFactorial(int num){
		
		if(num == 0)
			return 1;
		
		int factorial = 1;
		for(int i = 1; i <= num; i++) {
			factorial *= i;
		}
		
		return factorial;
	}
	
	public static int levelUp(int k, List<Integer> score) {
        if(k <= 0) return 0;
        Collections.sort(score, Collections.reverseOrder());
        System.out.println(score);
        int rank = 1;
        int res = 0;
        for(int i = 0; i < score.size(); i++) {
            if(i == 0) {
                rank = 1;
            } else if(score.get(i) != score.get(i - 1)) {
                rank = i + 1;
            }
            if(rank <= k && score.get(i) > 0) res++;
            else break;
        }
        return res;
    }
	
	public static long carParkingRoof(List<Long> cars, int k) {
		// Write your code here
        if (cars.size() == 0 || k < 0) {
            return 0;
        }

        Collections.sort(cars);
        long minDist = Long.MAX_VALUE;

        for (int i = 0; i <= cars.size() - k; i++) {
            minDist = Math.min(minDist, cars.get(i + k - 1) - cars.get(i));
        }

        return minDist + 1;
    }
	
	public static int findMax(int[] space, int x)
	{
	    int chunkNum = 1;
	    Stack<Integer> s = new Stack<>();
	    s.push(0);

	    for (int i = 1; i < space.length; i++)
	    {
	        // first chunk
	        if (i < x)
	        {
	            if (space[i] < space[s.peek()])
	            {
	                s.pop();
	                s.push(i);
	            }
	        }
	        // other chunks
	        else
	        {
	            // if found minimum is member of current chunk we just need to compare current number with it
	            int peek = s.peek();
	            if (peek >= chunkNum)
	            {
	                s.push(space[i] < space[peek] ? i: peek);
	            }
	            // we have to loop through current chunk to find minimum number
	            else
	            {                
	                s.push(i);
	                
	                int j = chunkNum;
	                int count = 0;
	                while (count++ < x)
	                {
	                    if (space[j] < space[s.peek()])
	                    {
	                        s.pop();
	                        s.push(j);
	                    }
	                    j++;
	                }
	            }
	            // we are ready to go to next chunk
	            chunkNum++;
	        }
	    }
	    
	    // Initialize maximum element
        int max = space[0];
       
        // Traverse array elements from second and
        // compare every element with current max  
        for (int i = 1; i < space.length; i++)
            if (space[i] > max)
                max = space[i];
       
        return max;
	}
	
	

}
