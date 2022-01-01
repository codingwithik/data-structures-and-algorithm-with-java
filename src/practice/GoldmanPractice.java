package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GoldmanPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1, 2, 5, 4, 0, 2, 1};
        int arr2[] = {2, 4, 5, 0, 1, 1, 2}; 
        String[][] scores = {{"Bobby", "87"}, {"Bobby", "100"}, {"Eric", "64"}, {"Charles", "22"}};
        
//		System.out.println(fractionToDecimal(2, 3));
//		
//		System.out.println("Maximum sum of a subarray of size K: "
//			        + findMaxSumSubArray(6, new int[] { 1,2,3,4}));
        
        System.out.println(characterReplacement("ABBB", 2));
	}
	
	// { {1,5,20}, {3,8,15}, {8,10, 8}}
	private static List<Intervals> getIntervals(List<Intervals> list) {
		
        Collections.sort(list, (a,b) -> a.startTime - b.startTime);
        
        List<Intervals> res = new ArrayList<>();
        int startTime = list.get(0).startTime;
        int endTime = list.get(0).endTime;
        int price = list.get(0).price;

        for(int i = 1; i < list.size(); i++)
        {
            Intervals current = list.get(i);
            // If the current startTime is less than previous startTime and there is a cheaper price. 
            //We append our previous startTime -> currentStartTime - 1 and update our start and endTimes
            if(current.startTime <= endTime && current.price < price)
            {
                res.add(new Intervals(startTime, current.startTime - 1, price));
                startTime = current.startTime;
                endTime = current.endTime;
                price = current.price;
            }
           //Else we simply add the startTime and endTime with their price and update.
            else
            {
                res.add(new Intervals(startTime, endTime, price));
                startTime = current.startTime;
                endTime = current.endTime;
            }
        }

        res.add(new Intervals(startTime, endTime, price));
        return res;
    }

	// 1, 2, 3, 4
	public static int findMaxSumSubArray(int s, int[] nums) {
		int left = 0, right = 0, sum = 0, min = Integer.MAX_VALUE;
	    while (right < nums.length) {
	    	//6, new int[] { 1,2,3,4}
	        sum += nums[right];
	        right++;
	        //r = 1
	        //r = 2
	        //r = 3
	        //s = 6
	        //s = 5
	        //s = 9
	        //r = 4
	        
	        while (sum >= s) {
	            sum -= nums[left];
	            min = Math.min(min, right - left);
	            left++;
	            //s = 5
	            //m = 3
	            //l = 1
	            //s = 7
	            //m = 3
	            //l = 2
	            //s = 4
	            //m = 2
	            //l = 3
	        }
	    }
	    
	    return min == Integer.MAX_VALUE ? 0 : min;
	}
	
	
	public static int iterativeBinarySearch(int[] input, int value) {
		int start = 0;
		int end = input.length;
		
		while(start < end) {
			int midpoint = (start + end)/2;
			if(input[midpoint] == value) {
				
				return midpoint;
				
			}else if(input[midpoint] < value) {
				
				start = midpoint + 1;
				
			}else {
				
				end = midpoint;
				
			}
		}
		
		return -1;
	}
	
	public static int averageScore(String[][] scores) {
        
		  Map<String, Integer> count = new HashMap<>();
		  Map<String, Integer> studentScore = new HashMap<>();
		  
		  for(int i = 0; i < scores.length; i++) {
			  if(count.containsKey(scores[i][0])) {
				count.put(scores[i][0], count.get(scores[i][0]) + 1);  
			  }else {
				  count.put(scores[i][0], 1);
			  }
		  }
		  
		  for(int i = 0; i < scores.length; i++) {
			  if(studentScore.containsKey(scores[i][0])) {
				  studentScore.put(scores[i][0], studentScore.get(scores[i][0]) + Integer.parseInt(scores[i][1]));  
			  }else {
				  studentScore.put(scores[i][0], Integer.parseInt(scores[i][1]));
			  }
		  }
		  
		  int max = 0;
		  int sum = 0;
		  for(int i = 0; i < scores.length; i++) {
			  if(count.get(scores[i][0]) != 0) {
				  sum = studentScore.get(scores[i][0]) / count.get(scores[i][0]); 
				  if(sum > max) {
					  max = sum;
				  }
				  count.put(scores[i][0], 0);
			  }
		  }
		  
		  
	      return max;
	  }
	
	public static String fractionToDecimal(int numerator, int denominator) {
        
		Map<Long, Integer> map = new HashMap<>();
		StringBuilder sb = new StringBuilder();
        long n = Math.abs((long)numerator);
        long d = Math.abs((long)denominator);
		long r = 20 % 3;
		
		System.out.println("n "+n);
		System.out.println("d "+d);
		System.out.println("r "+r);
		
        if(numerator != 0 && numerator > 0 ^ denominator > 0) 
            sb.append("-");
		
        sb.append(n / d);                       // Integral part

        if(r > 0)
			sb.append(".");						// Fractional part
		
        while(r > 0){
            if(map.containsKey(r)){
            	
                int index = map.get(r);
                sb.insert(index, "(");
                sb.append(")");
                break;
                
            }else {
            	System.out.println("put = "+r);
            	System.out.println("len = "+sb.length());
                map.put(r, sb.length());
                r = r * 10;
                System.out.println("Value = "+r);
                System.out.println("Value = "+d);
                System.out.println("appendedValue = "+r/d);
                sb.append(r / d);
                r = r % d;
                System.out.println("newValue = "+r);
            }
        }
        return sb.toString();
	 }
	
	// solution should be a sliding window
	 public static int characterReplacement(String s, int k) {
	        
        char firstNum = s.charAt(0);
        int numCount = 0;
        
        StringBuilder newString = new StringBuilder();
        newString.append(firstNum);
        
        for(int i = 1; i < s.length(); i++){
            if(firstNum != s.charAt(i) && numCount != k){
            	newString.append(firstNum);
                numCount++;
            }else {
            	newString.append(s.charAt(i));
            }
        }
        
        int max = 1; int sum = 0;
        String n = newString.toString();
        
        System.out.println("new String = "+ n);
        for(int i = 1; i < n.length(); i++){
            if(firstNum == n.charAt(i)){
                max++;
            }else{
                firstNum = n.charAt(i);
                max = 1;
            }
            if(max > sum) sum = max;
        }
        
        return sum;
	        
	 }

}
